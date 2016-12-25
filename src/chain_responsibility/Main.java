package chain_responsibility;

/**
 * Created by bohdan on 12/6/16.
 */
public class Main {
    public static void main(String[] args) {
        Dispense d10 = new Dollar10Dis();
        Dispense d20 = new Dollar20Dis();
        Dispense d50 = new Dollar50Dis();
        d50.setNext(d20);
        d20.setNext(d10);
        d50.getAmount(new Currency(130));
        float  b = 23f;
        double  a = b;
    }
}
