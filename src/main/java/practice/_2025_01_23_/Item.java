package practice._2025_01_23_;

public class Item {

private  String name;
private double price;
private double rating;

    public Item(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}
