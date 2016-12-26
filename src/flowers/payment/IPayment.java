package flowers.payment;

/**
 * Interface for the future different concrete implementations of the stategy algorithms.
 */
public interface IPayment {
    void pay(double price);
}
