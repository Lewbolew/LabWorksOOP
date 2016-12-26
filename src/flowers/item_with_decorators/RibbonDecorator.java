package flowers.item_with_decorators;

/**
 * In the ConcreteDecorator class, override any Component method(s) whose behavior needs to be modified
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
