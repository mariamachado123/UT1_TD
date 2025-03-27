public class Contador {

    public static void mostrarContador() {
        final int maxCont=50;
        int incremento=1;
        int contador=1;
        for(incremento=1;incremento<=maxCont;incremento++) {
            System.out.printf("%d ", incremento); /*Se imprime el incremento del contador*/
            contador=contador+incremento; /*vamos sumando el contador*/
        }

    }
    public static void main(String[] args) {
        mostrarContador(); /*llamamos al metodo, para mostrarlo*/
    }
}
