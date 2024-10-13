import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the online store of branded clothing!");

        while (true) {
            System.out.println("Enter the product name (or 'exit' to exit): ");
            String product = scanner.nextLine();

            if (product.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for your purchase! Goodbye.");
                break;
            }

            System.out.println("Введите тип оплаты (Halyk, Kaspi, PayPal): ");
            String paymentType = scanner.nextLine();

            shoppingFacade.placeOrder(product, paymentType);
            System.out.println();
        }

        scanner.close();
    }
}