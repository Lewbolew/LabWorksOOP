package flowers.delivery;

import flowers.item_with_decorators.Item;

/**
 * Interface for the future different concrete implementations of the stategy algorithms.
 */
public interface IDelivery {
    void deliver(Item items);
}
