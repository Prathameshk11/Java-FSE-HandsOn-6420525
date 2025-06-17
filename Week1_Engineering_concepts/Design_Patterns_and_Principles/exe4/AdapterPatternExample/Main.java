public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter();
        paypalProcessor.processPayment(50.0);  

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(4000.0); 
    }
}
