//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] arreglo1 = {"manzana", "pera", "naranja"};
        String[] arreglo2 = {"pera", "uva", "manzana"};
        ContadorPalabras cp = new ContadorPalabras(arreglo1, arreglo2);
        cp.palabrasComunes();
    }
}

