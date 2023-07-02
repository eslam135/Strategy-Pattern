// Usage example
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Set the payment strategy to credit card
        cart.setPaymentStrategy(new PayByCreditCard("1234567890", "12/25", "123"));

        // Checkout with the chosen payment strategy
        cart.checkout(100);

        // Set the payment strategy to PayPal
        cart.setPaymentStrategy(new PayByPayPal("example@example.com", "password"));

        // Checkout with the new payment strategy
        cart.checkout(200);
    }
}
