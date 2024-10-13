import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<String, Double> products;

    public ProductCatalog() {
        products = new HashMap<>();
        products.put("Nike T-shirt", 45.00);
        products.put("Adidas Jeans", 70.00);
        products.put("Puma Jacket", 120.00);
        products.put("Gucci Sneakers", 300.00);
        products.put("Zara dress", 50.00);
    }

    public void searchProduct(String product) {
        if (products.containsKey(product)) {
            System.out.println("Performs a product search: " + product);
        } else {
            System.out.println("The product was not found: " + product);
        }
    }

    public void selectProduct(String product) {
        if (products.containsKey(product)) {
            System.out.println("The product is selected: " + product);
        } else {
            System.out.println("The product is not available: " + product);
        }
    }

    public Double getProductPrice(String product) {
        return products.get(product);
    }

    public boolean isProductAvailable(String product) {
        return products.containsKey(product);
    }
}