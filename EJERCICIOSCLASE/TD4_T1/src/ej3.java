public class ej3 {
    public class NumberHolder {
        /*creamos las variables de instancia*/
        public int anInt;
        public float aFloat;

        /*creamos el constructor*/
    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;

    }
    public static void main(String[] args) {
        ej3 j1 = new ej3();

        /* Se crea una instancia de la clase interna NumberHolder a través de la instancia de ej3*/
        ej3.NumberHolder numberHolder=j1.new NumberHolder(10,20);
        numberHolder.anInt=10;
        numberHolder.aFloat=10.0f;
        System.out.println(numberHolder.anInt);
        System.out.println(numberHolder.aFloat);
    }

    }
}
