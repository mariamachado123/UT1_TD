public class ej5 {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d); //La variable s almacena el valor de d convertido a una cadena de texto, que en este caso será "888.51".

        int dot = s.indexOf('.');  // Busca la posición del punto decimal.

        // Imprime la cantidad de dígitos antes del punto decimal.
        System.out.println(dot + " digitos antes del punto decimal."); //seria "3"
        // Imprime la cantidad de dígitos después del punto decimal.
        System.out.println( (s.length() - dot - 1) + " digitos despues del punto decimal."); // sería 2
    }
}
