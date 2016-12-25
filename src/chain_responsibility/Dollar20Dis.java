package chain_responsibility;

/**
 * Created by bohdan on 12/6/16.
 */
public class Dollar20Dis extends Dispense {

    @Override
    void getAmount(Currency currency) {
        int m = currency.getMoney();
        next.getAmount(new Currency(m % 20));
        System.out.println(m % 20 + "Dollars");
    }
}
