public class ej6_j {
    public static void main(String[] args) {
        String palabra="Hola Mundo";
        System.out.println(palabra.replace("o","O"));
        System.out.println(palabra.replace("H","3"));

        String palabra2="h0l1 m4nd7 ";
        System.out.println(palabra2.replaceAll("\\d","+"));

        String palabra3="Hola Mundo";
        System.out.println(palabra3.replaceFirst("M","{"));
    }
}
