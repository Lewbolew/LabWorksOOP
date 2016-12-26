package flowers.payment;

/**
 * Certain implementation of strategy algorithm.
 * This algorithm we use When user choose PayPal payment.
 */
public class PayPaLPaymentStrategy implements IPayment{
    @Override
    public void pay(double price) {
        System.out.println("You have payed by PayPal service " + price + " dollars");
    }
}
