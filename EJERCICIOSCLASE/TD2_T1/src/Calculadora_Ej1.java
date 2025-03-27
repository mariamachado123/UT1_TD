import java.util.Scanner;
public class Calculadora_Ej1 {
    //Al no tener NetBeans, cree una calculadora
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Que desea realizar:\n A)sumar \n B)restar \n C)multiplicar \n D) dividir \n");
        String op = sc.nextLine().toUpperCase(); //Guardamos la opcion
        if (!op.equals("A") && !op.equals("B") && !op.equals("C") && !op.equals("D")) {
            System.out.print("Opcion no válida, intente de nuevo\n");
            return;
        }
        System.out.print("Escriba el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Escriba el segundo numero: ");
        int num2 = sc.nextInt();

        switch (op) { /*usamos un switch para ir comprobando la respuesta*/
            case "A":
                suma(num1, num2); /*llamamos al metodo*/
                break; /*salimos*/

            case "B":
                resta(num1, num2);
                break;

            case "C":
                multiplicacion(num1, num2);
                break;

            case "D":
                division(num1, num2);
                break;

        default:
            System.out.print("Opcion invalida, intente de nuevo");
        }


    }

    public static void suma(int a, int b) {
        double resultado = a + b;
        System.out.printf("%f ", resultado);
    }

    public static void resta(int a, int b) {
        double resultado = a - b;
        System.out.printf("%f ", resultado);
    }
    public static void multiplicacion(int a, int b) {
        double resultado = a * b;
        System.out.printf("%f ", resultado);
    }
    public static void division(int a, int b) {
        if (b==0){
            System.out.printf("no es posible dividir entre 0");}
        else{

            double resultado = a / b;
            System.out.printf("%f ", resultado);}
    }
}
