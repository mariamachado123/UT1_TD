public class ej2 {
    public void esPrimo(int num) {
        int numImpares = 0;
        int numerosPares = 0;
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                System.out.println("El numero no es primo");
                i = num + 1;
                int j = 1;
                while (j <= num) {
                    if (j % 2 == 0) {
                        numImpares += j;
                    }
                    j++;
                }
                System.out.println("La suma de los números impares hasta " + num + " es: " + numImpares);
            }
            i++;
        }

    if (i==num){
        System.out.println("El numero es primo");
        int j=0;
        while (j<=num){
            if (j%2==0){
                numerosPares += j;
            }
            j++;
        }
        System.out.println("La suma de los números pares hasta " + num + " es: " + numerosPares);
        }
    }
    public static void main(String[] args) {
    ej2 ej2=new ej2();
    ej2.esPrimo(5);
    ej2.esPrimo(10);}
}
