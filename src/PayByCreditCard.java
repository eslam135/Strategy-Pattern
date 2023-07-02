// Implement different strategies
class PayByCreditCard implements PaymentStrategy {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public PayByCreditCard(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public void pay(int amount) {
        System.out.println("Paying $" + amount + " with credit card: " + cardNumber);
        // Perform the payment logic
    }
}
