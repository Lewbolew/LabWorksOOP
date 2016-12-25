package flowers.payment;

/**
 * Created by bohdan on 11/8/16.
 */
public class PayPaLPaymentStrategy implements IPayment{
    @Override
    public void pay(double price) {
        System.out.println("You have payed by PayPal service " + price + " dollars");
    }
}
