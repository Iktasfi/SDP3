import java.util.HashMap;
import java.util.Map;

// This class checks product availability in the inventory
public class InventoryManager {
    private Map<String, Integer> stock;

    public InventoryManager() {
        // Initializing stock levels for each product
        stock = new HashMap<>();
        stock.put("Nike T-shirt", 100);
        stock.put("Adidas Jeans", 400);
        stock.put("Puma Jacket", 900);
        stock.put("Gucci Sneakers", 0); // Out of stock
        stock.put("Zara dress", 700);
    }

    // Check if the product is available in stock
    public boolean checkStock(String product) {
        for (String key : stock.keySet()) {
            if (key.equalsIgnoreCase(product)) {
                int quantity = stock.get(key);
                if (quantity > 0) {
                    System.out.println("Stock available for product: " + product);
                    return true;
                } else {
                    System.out.println("Product is out of stock: " + product);
                    return false;
                }
            }
        }
        System.out.println("Product not found in inventory: " + product);
        return false;
    }
}
