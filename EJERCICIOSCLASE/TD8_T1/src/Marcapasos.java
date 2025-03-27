public class Marcapasos {
    /*Creamos sus variables de instancia*/
    private byte presionSanguinea;
    private byte frecuenciaCardiaca;
    private short nivelAzucarEnSangre;
    private long maxFuerza;
    private float minTiempoLatidos;
    private float bateria;
    private String codigoFabricante;

    /*Creamos el constructor*/
    public Marcapasos(String codigoFabricante, byte presionSanguinea, byte frecuenciaCardiaca, short nivelAzucarEnSangre, long maxFuerza, float minTiempoLatidos, float bateria) {
        this.codigoFabricante = codigoFabricante;
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.bateria = bateria;
        this.maxFuerza = maxFuerza;
        this.minTiempoLatidos = minTiempoLatidos;
        this.nivelAzucarEnSangre = nivelAzucarEnSangre;
    }

    public void presionSanguinea() {
        /*Verificamos que este dentro de los parametros estipulados*/
        while (presionSanguinea <= 250 && presionSanguinea >= 0) {
            System.out.println("presionSanguinea:" + presionSanguinea);

        }
        System.out.println("presión sanguinea fuera de los parametros");
    }

    public void frecuenciaCardiaca() {
        while (frecuenciaCardiaca <= 226 && frecuenciaCardiaca >= 0) {
            System.out.println("frecuenciaCardiaca:" + frecuenciaCardiaca);
        }
        System.out.println("frecuencia Cardiaca fuera de los parametros");
    }

    public void nivelAzucarEnSangre() {
        if (nivelAzucarEnSangre <= 1000 && nivelAzucarEnSangre >= 0) {
            System.out.print("nivel Azucar En Sangre:" + nivelAzucarEnSangre);
        }
        System.out.println("nivel azucar en sangre fuera de los parametros");
    }

    public void maxFuerza() {
        if (maxFuerza >= 3000000000L && maxFuerza >= 0) {
            System.out.println("maximo de Fuerza:" + maxFuerza);
        } else {
            System.out.println("maximo de Fuerza fuera de los parametros");
        }

    }

    public void minTiempoLatidos() {
        if (minTiempoLatidos >= 100 && minTiempoLatidos >= 0) {
            System.out.println("minimo de Tiempo entre Latidos:" + minTiempoLatidos + "minutos");
        } else {
            System.out.println("minimo de Tiempo entre Latidos");
        }
    }

    public void bateria() {
        if (bateria <= 100 && bateria >= 0) {
            System.out.println("bateria:" + bateria + "%");
        } else {
            System.out.println("bateria fuera de los parametros");
        }
    }

    public void codigoFabricante() {
        if (codigoFabricante.length() < 8 && codigoFabricante.matches("[a-zA-Z0-9]+")) {
            System.out.println("codigoFabricante:" + codigoFabricante);
        } else {
            System.out.println("codigo del fabricante invalido");
        }
    }
}
