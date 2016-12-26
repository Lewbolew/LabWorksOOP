package flowers.payment;

/**
 * Certain implementation of strategy algorithm.
 * This algorithm we use When user choose Credit card payment.
 */
public class CreditCartPaymentStrategy implements IPayment{
    @Override
    public void pay(double price) {
        System.out.println("You payed by credit card " + price + " dollars");
    }
}
