public class Multiplicacion {
    int[] arreglo1;
    int[] arreglo2;
    int resultado;

    public Multiplicacion(int[] arreglo1, int[] arreglo2) {
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }
    public void Resultado() {
        if (arreglo1.length == arreglo2.length) {
            for (int j = 0; j < arreglo1.length; j++) {
                resultado = arreglo1[j] * arreglo2[j];
            }
            System.out.println("El resultado es "+ resultado);
        }else {
            System.out.println("Cantidad de numeros no iguales");
        }

    }
    public static void main(String[] args) {
            int[] arreglo1 = {1, 2, 3, 4, 5};
            int[] arreglo2 = {6, 7, 8, 9,10};
            Multiplicacion m = new Multiplicacion(arreglo1, arreglo2);
            m.Resultado();
    }
}
