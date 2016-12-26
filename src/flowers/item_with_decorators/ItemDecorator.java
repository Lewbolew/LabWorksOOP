package flowers.item_with_decorators;

/**
 * The Decorator class passes a Component to the Decorator constructor to initialize the Component pointer
 */
public abstract class ItemDecorator implements Item {
    Item item;

    ItemDecorator(Item itm) {
        item = itm;
    }

    public abstract String getDescription();
}
