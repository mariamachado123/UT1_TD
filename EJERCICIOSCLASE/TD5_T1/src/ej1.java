import java.util.EnumSet;

public class ej1 {

    public enum TamanoPizza{
    GRANDE,PEQUENA,MEDIANA
    }
    public static class Pizza {
        private TamanoPizza tamanoPizza;

        public Pizza (TamanoPizza tamanoPizza) {
            this.tamanoPizza = tamanoPizza;

        }

        public void MostrarPizza()
        {
            System.out.println("pizza"+tamanoPizza.toString());
        }
    }
    public static void main(String[] args) {
        Pizza pizza = new Pizza(TamanoPizza.GRANDE);
        pizza.MostrarPizza();

    }
}
