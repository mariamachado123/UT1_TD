import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej3 {

    public static void leerEntradaStdin() {
        BufferedReader br = null;
        String[] elementos = new String[1];
        int i = 0;
        try {
            br = new BufferedReader(new FileReader("TD6_T1/src/radio.txt"));
            String linea;

            /* Leer las tres líneas*/
            while ((linea = br.readLine()) != null && i < 3) {
                elementos[i] = linea.trim();  // Eliminar espacios en blanco alrededor de la cadena
                i++;
            }
            int radio = Integer.parseInt(elementos[0]);
            System.out.println("El area es: " + Math.PI * Math.pow(2, radio));
            System.out.println("El perimetro es: " + 2 * Math.PI * radio);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir el número. Asegúrate de que los datos sean válidos.");
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        leerEntradaStdin();
    }
}