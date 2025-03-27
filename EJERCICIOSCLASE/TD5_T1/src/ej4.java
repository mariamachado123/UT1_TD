public class ej4 {
    public static void main(String[] args) {

        if (args.length == 2) {
            // convert strings to numbers
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            if (a > 0 && b > 0) {

                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " +
                        (a - b));
                System.out.println("a * b = " +
                        (a * b));
                System.out.println("a / b = " +
                        (a / b));
                System.out.println("a % b = " +
                        (a % b));
            }
            else {
                System.out.println("Hay valores menores que 0, intente de nuevo");
            }
        }
        else {
            System.out.println("El programa requiere 2 argumentos");
        }
    }

}



