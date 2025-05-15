package javaPro3._05_14.task2;

import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductInput productInput = new ProductInput(scanner);


        System.out.println("Enter info about product");

        String title = productInput.inputText("Enter a title");
        int qantity = productInput.inputInt("Enter a qantity");
        double price = productInput.inputDouble("Enter price");

        Product product = new Product(title,qantity, price);


        System.out.println(product);
        scanner.close();
    }
}
