package flowers;

import flowers.item_with_decorators.Item;

import java.util.ArrayList;

/**
 * Flower shop, which contain different bouquets and can choose on of the best.
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
