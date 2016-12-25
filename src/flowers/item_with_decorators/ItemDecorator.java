package flowers.item_with_decorators;

/**
 * Created by bohdan on 11/8/16.
 */
public abstract class ItemDecorator implements Item {
    Item item;

    ItemDecorator(Item itm) {
        item = itm;
    }

    public abstract String getDescription();
}
