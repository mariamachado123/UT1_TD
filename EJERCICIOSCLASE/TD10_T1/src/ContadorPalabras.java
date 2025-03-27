public class ContadorPalabras {

    String[]arreglo1;
    String[]arreglo2;

    public ContadorPalabras(String[] arreglo1, String[] arreglo2) {
        this.arreglo1=arreglo1;
        this.arreglo2=arreglo2;
    }
    public void palabrasComunes() {
        if(arreglo1.length==arreglo2.length) {
            for (int i = 0; i < arreglo1.length; i++) {
                for (int j = 0; j < arreglo2.length; j++) {
                    /*Comparamos si las palabaras son iguales, si es asi, se imprime*/
                    if (arreglo2[i].equals(arreglo1[i])) {
                        System.out.println(arreglo1[i]);
                    }
                }

            }

        }
        if(arreglo2.length>arreglo1.length) {
            /*Al ser el arreglo 2 mas largo, es el primero que usaremos en el bucle for, para que se vean todas las palabras*/
            for (int i = 0; i < arreglo2.length; i++) {
                for (int j = 0; j < arreglo1.length; j++) {
                    if (arreglo2[i].equals(arreglo1[j])) {
                        System.out.println(arreglo2[i]);
                    }
                }
            }
        }
        else{
            for (int i = 0; i < arreglo1.length; i++) {
                for (int j = 0; j < arreglo2.length; j++) {
                    if (arreglo2[i].equals(arreglo1[j])) {
                        System.out.println(arreglo2[i]);
                    }
                }
            }
        }
    }
}
