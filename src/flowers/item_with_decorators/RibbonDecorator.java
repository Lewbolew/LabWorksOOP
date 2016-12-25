package flowers.item_with_decorators;

/**
 * Created by bohdan on 11/8/16.
 */
public class RibbonDecorator extends ItemDecorator {
    Item item;
    RibbonDecorator(Item itm) {
        super(itm);
    }

    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "Decorated with ribbon";
    }
}
