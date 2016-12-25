package flowers.item_with_decorators;

/**
 * Created by bohdan on 11/8/16.
 */
public class BasketDecorator extends ItemDecorator {
    Item item;
    BasketDecorator(Item itm) {
        super(itm);
    }

    @Override
    public double price() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "Decorated with basket";
    }
}
