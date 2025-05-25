package javaPro3._05_20.pizza2;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaService service = new PizzaService();

        service.calculateKalories(new Pizza(24,40), new Pizza(28,40));
    }
}
