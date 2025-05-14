package javaPro3._14_05.task2;

public class Product {
   private String title;
   private int quantity;
   private double price;

    public Product(String title, int quantity, double price) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product -> " +
                "title : '" + title + '\'' +
                ", price : " + price;
    }
}
