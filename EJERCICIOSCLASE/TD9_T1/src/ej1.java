import java.util.Scanner;

public class ej1 {

    public void factorial(int n) {
        int factorial=1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su numero para hacer el factorial:");
        String texto=sc.nextLine();
        int numero=Integer.parseInt(texto);
        ej1 ej1=new ej1();
        ej1.factorial(numero);
    }
}
