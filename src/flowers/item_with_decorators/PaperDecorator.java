package flowers.item_with_decorators;

/**
 * Created by bohdan on 11/8/16.
 */
public class PaperDecorator extends ItemDecorator {
    Item item;

    PaperDecorator(Item itm) {
        super(itm);
    }

    public double price() {
        return 13 + item.price();
    }
    
    @Override
    public String getDescription() {
        return item.getDescription() + "Decorated with paper";
    }
}
