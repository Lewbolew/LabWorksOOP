package chain_responsibility;

/**
 * Created by bohdan on 12/6/16.
 */
public class Dollar10Dis extends Dispense {

    @Override
    void getAmount(Currency currency) {
        int m = currency.getMoney();
        if(m % 10 != 0 ) {
            throw new ExceptionInInitializerError("We can`t give to you such sum of money!");
        }
        //next.getAmount(new Currency(m % 10));
        System.out.println(m % 10 + "Dollars");
    }
}