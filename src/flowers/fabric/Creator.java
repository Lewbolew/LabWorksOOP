package flowers.fabric;

import flowers.Flower;
import flowers.item_with_decorators.Item;

import java.util.List;

/**
 * Created by bohdan on 12/20/16.
 */
public abstract interface Creator {
    public abstract Item factoryMethod();
    public abstract Item factoryMethod(String name);
    public abstract Item factoryMethod(String name, List<Flower> flowerList);
}
