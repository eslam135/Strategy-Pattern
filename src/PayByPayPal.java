class PayByPayPal implements PaymentStrategy {
    private String email;
    private String password;

    public PayByPayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println("Paying $" + amount + " with PayPal: " + email);
    }
}
