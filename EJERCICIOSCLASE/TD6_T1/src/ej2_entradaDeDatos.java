import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej2_entradaDeDatos {

    public static void leerEntradaArchivo(String rutaArchivo) {
        BufferedReader br = null;
        String[] elementos = new String[3];
        int i = 0;
        try {
            br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            /* Leer las tres líneas*/
            while ((linea = br.readLine()) != null && i < 3) {
                elementos[i] = linea.trim();  // Eliminar espacios en blanco alrededor de la cadena
                i++;
            }

            /* Mostrar la salida*/
            System.out.println("El entero leído es: " + elementos[0]);
            System.out.println("El número de punto flotante es: " + elementos[1]);
            System.out.println("La cadena leída es: " + elementos[2]);

            /* Imprimir los resultados de las operaciones*/
            int entero = Integer.parseInt(elementos[0]); // Convierte la cadena a entero
            float flotante = Float.parseFloat(elementos[1]); // Convierte la cadena a float

            /* Suma de ambos*/
            System.out.println("¡Hola " + elementos[2] + "! La suma de " + entero + " y " + flotante + " es: " + (entero + flotante));

            /* División entera y resto*/
            int divisionEntera = (int) (flotante / entero); // División entera
            float resto = flotante % entero; // Resto
            System.out.println("La división entera de " + flotante + " y " + entero + " es: " + divisionEntera + " y su resto es: " + resto);

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
        // Ruta del archivo
        String nombreArchivo = "C:\\Users\\Estudiante UCU\\OneDrive - Universidad Católica del Uruguay\\SEGUNDO AÑO\\PRIMER SEMESTRE\\ALGORITMOS\\archivo.txt";
        leerEntradaArchivo(nombreArchivo);
    }
}
