package javaPro3._05_19.product;

public class ProductApp {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        Category category = service.createCategory();
        Product product = service.createProduct(category);

        System.out.println(category);
        System.out.println(product);
    }
}
