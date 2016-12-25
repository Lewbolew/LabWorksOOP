package flowers.fabric;

import flowers.Bouquet;
import flowers.Flower;
import flowers.item_with_decorators.Item;

import java.util.List;

/**
 * Created by bohdan on 12/20/16.
 */
public class BouqetCreator implements Creator {

    @Override
    public Item factoryMethod() {
        return new Bouquet();
    }

    @Override
    public Item factoryMethod(String name) {
        return new Bouquet(name);
    }

    @Override
    public Item factoryMethod(String name, List<Flower> flowerList) {
        return new Bouquet(name, flowerList);
    }
}
