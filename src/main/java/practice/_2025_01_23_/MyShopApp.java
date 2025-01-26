package practice._2025_01_23_;

public class MyShopApp {

    public static void main(String[] args) {

        Item apple = new Item("Apple", 2.5, 10);
        Item banana = new Item("Banana", 1.5, 9);
        Item guava = new Item("Guava", 7 - 2, 11);
        Item[] fruits = {apple, banana, guava};

        Item potato = new Item("Potato", 0.9, 6);
        Item onion = new Item("Onion", 0.3, 4);
        Item carrot = new Item("Carrot", 0.4, 6);
        Item[] vegetables = {potato, onion, carrot};

        Category categoryVegetables = new Category("Vegetables", vegetables);
        Category categoryFruits = new Category("Fruits", fruits);

        User user = new User("Ivan" , "passw", new Basket());
        Basket basket = user.getBasket();

        basket.addItems(fruits[0]);
        basket.addItems(vegetables[1]);
        basket.addItems(vegetables[2]);
        System.out.println("Bsket price: " + basket.getTotalPrice());
        System.out.println("Bsket AVG rating: " + basket.getAvgRating());
    }
}
