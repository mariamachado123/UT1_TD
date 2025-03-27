import java.io.*;
import java.util.*;

public class ContadorPalabras {

    public static String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        Set<String> conjuntoPalabras1 = new HashSet<>(Arrays.asList(palabras1));
        List<String> resultado = new ArrayList<>();

        for (String palabra : palabras2) {
            if (conjuntoPalabras1.contains(palabra)) {
                resultado.add(palabra);
            }
        }
        return resultado.toArray(new String[0]);
    }

    public class LeerArchivo {

        public void leerArchivo(String nombreCompletoArchivo) {
            try {
                FileReader fr = new FileReader(nombreCompletoArchivo);
                BufferedReader br = new BufferedReader(fr);

                for (String lineaActual = br.readLine(); lineaActual != null; lineaActual = br.readLine()) {
                    System.out.println(lineaActual);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
                e.printStackTrace();
            }

            System.out.println("Archivo leído satisfactoriamente");
        }

        public String[] obtenerLineas(String archivo) {
            List<String> lineas = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    lineas.add(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + archivo);
                e.printStackTrace();
            }

            return lineas.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        // Crear la instancia de la clase ContadorPalabras
        ContadorPalabras contadorPalabras = new ContadorPalabras();

        ContadorPalabras.LeerArchivo lector = contadorPalabras.new LeerArchivo();

        String archivo = "C:\\Users\\Estudiante UCU\\Downloads\\informatica.txt";

        String[] lineas = lector.obtenerLineas(archivo);
        System.out.println("\nLíneas obtenidas del archivo:");

        // Verificar que el archivo tiene al menos dos líneas
        if (lineas.length < 2) {
            System.out.println("El archivo debe contener al menos dos líneas.");
            return;
        }

        for (int i = 0; i < lineas.length; i++) {
            System.out.println("Línea " + (i + 1) + ": " + lineas[i]);
        }

        Random random = new Random();
        int i1 = random.nextInt(lineas.length);
        int i2;
        do {
            i2 = random.nextInt(lineas.length);
        } while (i1 == i2); // Asegurar que no se seleccionen las mismas líneas

        String[] palabras1 = lineas[i1].split("\\s+");
        String[] palabras2 = lineas[i2].split("\\s+");
        
        String[] resultado = palabrasComunes(palabras1, palabras2);

        System.out.println("Palabras comunes: " + Arrays.toString(resultado));
    }
}
