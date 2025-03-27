public class ej7 {
    public static void main(String[] args) {

        /* CONSTRUCTORES(parteA)*/
        System.out.println("CONSTRUCTORES");
        StringBuilder sb1 = new StringBuilder(); // Constructor vacío
        StringBuilder sb2 = new StringBuilder("Hola"); // Constructor con cadena inicial
        StringBuilder sb3 = new StringBuilder(20); // Constructor con capacidad inicial
        System.out.println("sb1: \"" + sb1 + "\", sb2: \"" + sb2 + "\", sb3 capacidad: " + sb3.capacity());
        System.out.println();

        /*setLenght(parteB)*/
        System.out.println("setLenght");
        StringBuilder sb4 = new StringBuilder("Hola");
        sb4.setLength(10);
        System.out.println(sb4);
        sb4.setLength(2);
        System.out.println(sb4);
        System.out.println();

        /*ensureCapacity(parteC)*/
        System.out.println("ensureCapacity");
        StringBuilder sb5 = new StringBuilder("Hola");
        sb5.ensureCapacity(10);
        System.out.println(sb5);
        sb5.setLength(2);
        System.out.println(sb5);
        System.out.println();

        /*append(parteD)*/
        System.out.println("append");
        StringBuilder sb6 = new StringBuilder("Hola");
        sb6.append("Mundo");
        System.out.println(sb6);
        System.out.println();

        /*insert(parteE)*/
        System.out.println("insert");
        StringBuilder sb7 = new StringBuilder("Hola");
        sb7.insert(3,"Mundo");
        System.out.println(sb7);
        StringBuilder sb8 = new StringBuilder("Hola");
        sb8.insert(0,"Mundo");
        System.out.println(sb8);
        System.out.println();

        /*delete(parteF)*/
        System.out.println("delete");
        StringBuilder sb10 = new StringBuilder("Hola");
        sb10.delete(2,4);
        System.out.println(sb10);
        System.out.println();

        /*deleteCharAt*/
        System.out.println("deleteCharAt");
        StringBuilder sb9 = new StringBuilder("Hola");
        sb9.deleteCharAt(3);
        System.out.println(sb9);
        System.out.println();

        /*reverse(parteG)*/
        System.out.println("reverse");
        StringBuilder sb11 = new StringBuilder("Hola");
        sb11.reverse();
        System.out.println(sb11);
        System.out.println();
    }
}
