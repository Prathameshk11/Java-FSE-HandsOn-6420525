public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        System.out.println("Using Credit Card:");
        context.setStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.pay(1200.50);

        System.out.println("\nUsing PayPal:");
        context.setStrategy(new PayPalPayment("user@example.com"));
        context.pay(600.00);
    }
}
