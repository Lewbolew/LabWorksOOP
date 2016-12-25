package flowers.payment;

/**
 * Created by bohdan on 11/8/16.
 */
public class CreditCartPaymentStrategy implements IPayment{
    @Override
    public void pay(double price) {
        System.out.println("You payed by credit card " + price + " dollars");
    }
}
