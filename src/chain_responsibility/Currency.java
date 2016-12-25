package chain_responsibility;

/**
 * Created by bohdan on 12/6/16.
 */
public class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getMoney() {
        return amount;
    }
}
