package flowers.delivery;

import flowers.item_with_decorators.Item;

/**
 * Created by bohdan on 11/8/16.
 */
public class DHLDeliveryStrategy implements IDelivery {
    @Override
    public void deliver(Item items) {
        System.out.println("You have chosen DHL delivery service");
    }
}
