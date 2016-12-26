package flowers.item_with_decorators;

/**
 * In the ConcreteDecorator class, override any Component method(s) whose behavior needs to be modified
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
