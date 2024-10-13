public class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        productCatalog = new ProductCatalog();
        paymentProcessor = new PaymentProcessor();
        inventoryManager = new InventoryManager();
        shippingService = new ShippingService();
    }

    public void placeOrder(String product, String paymentType) {
        System.out.println("Performs product search and selection.");
        productCatalog.searchProduct(product);
        if (productCatalog.isProductAvailable(product)) {
            productCatalog.selectProduct(product);
            System.out.println("Checks the availability of goods in stock.");
            if (inventoryManager.checkStock(product)) {
                double price = productCatalog.getProductPrice(product);
                System.out.println("Manages payments and processes transactions.");
                paymentProcessor.processPayment(paymentType, price);
                System.out.println("Calculates the shipping cost and processes the order delivery.");
                shippingService.calculateShipping(product);
                shippingService.shipProduct(product);
                System.out.println("The order was successfully placed on: " + product);
            } else {
                System.out.println("The product is out of stock.");
            }
        } else {
            System.out.println("The product is not available for order.");
        }
    }
}