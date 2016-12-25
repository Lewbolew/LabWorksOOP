package flowers;

import flowers.item_with_decorators.Item;

import java.util.ArrayList;

/**
 * Created by bohdan on 10/4/16.
 */
public class FlowerShop {
    ArrayList<Item> bouqetList = new ArrayList<>();

    void addBouquet(Item item) {
        bouqetList.add(item);
    }

     Item getBest(){ // we get the most fresh, biggest bouquet for the lower price
         Item bestItem = new Bouquet();
         for(Item item: bouqetList) {
            if(item.price() < bestItem.price()) {
                bestItem = item;
            }
         }
         return bestItem;
    }

}
