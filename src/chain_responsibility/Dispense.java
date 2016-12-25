package chain_responsibility;

/**
 * Created by bohdan on 12/6/16.
 */
public abstract class Dispense {
    Dispense next;
    abstract void getAmount(Currency currency);
    void setNext(Dispense next) {
        this.next = next;
    }
}
