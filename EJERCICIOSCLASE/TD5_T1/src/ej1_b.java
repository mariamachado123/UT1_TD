public class ej1_b {


    public enum VOCALES {
        A,
        E,
        I,
        O,
        U
    }

    public enum CONSONANTES {
        B,
        C,
        D,
        F,
        G,
        H,
        J,
        K,
        L,
        M,
        N,
        P,
        Q,
        R,
        S,
        T,
        W,
        X,
        Y,
        Z
    }

    private int contador_vocales = 0;
    private int contador_consonantos = 0;


    public void Gettipo(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            System.out.println("Cadena vacía");
            return;
        }

        /*si la palabra no es vacia, verificamos si tiene vocal o consonante*/
        for (int i = 0; i < palabra.length(); i++) {
            char letra=Character.toUpperCase(palabra.charAt(i));
            boolean esVocal=false;
            for(VOCALES vocal:VOCALES.values()) {
                if(vocal.name().charAt(0) == letra) {
                    esVocal=true;
                    contador_vocales++;
                    System.out.println(letra +"  es una vocal");
                    break;
                }
            }
            if(!esVocal) {
                for (CONSONANTES consonante : CONSONANTES.values()) {
                    if (consonante.name().charAt(0) == letra)  {
                        contador_consonantos++;
                        System.out.println(letra + " es una consonante");
                        break;
                    }
                }
            }
        }
        mostrarContadores();
    }

    private void mostrarContadores() {
        System.out.println("Hay " + contador_consonantos + "  consonantes");
        System.out.println("Hay " + contador_vocales + "  vocales");
    }

    public static void main(String[] args){
        ej1_b palabra = new ej1_b();
        palabra.Gettipo("Pizza");
    }
}



















