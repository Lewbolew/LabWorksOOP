package flowers.delivery;

import flowers.item_with_decorators.Item;

/**
 * Certain implementation of strategy algorithm.
 * This algorithm we use When user choose Post delivery
 */
public class PostDeliveryStrategy implements IDelivery{
    @Override
    public void deliver(Item items) {
        System.out.println("You have chosen post delivery service");
    }
}
