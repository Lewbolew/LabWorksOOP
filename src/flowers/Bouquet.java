package flowers;

import flowers.item_with_decorators.Item;
import flowers.parent.Plant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Bouquet implements Item{
    List<Flower> flowerList;
    String name;
    int price = 0;
    int size = 0;
    boolean fresh = true;

    public Bouquet() {
        super();
    }
    public Bouquet(String name) {
        this.name = name;
    }
    public Bouquet(String name, List<Flower> flowerList){
        this.name = name;
        this.flowerList = flowerList;
    }

    void addFlowerList(Flower item) {
        flowerList.add(item);
    }
    void addFlower(Flower item) {
        flowerList.add(item);
    }

    Plant findStemLenght(int from, int to) {
        Flower result = null;
        for(Flower item: flowerList) {
            if (item.spec.getStemLenght() >= from && item.spec.getStemLenght() <= to) {
                result = item;
                break;
            }
        }
        if (result == null) {
            System.out.println("There isn`t any flower with this size of the stem!");
        }
        return result;
    }

    void sortByFreshness() { // Sort flowerList in this way: fresh flowers are in the right and no fresh in left
        for (int i = 0; i < flowerList.size(); i++) {
            if (flowerList.get(i).spec.getFresh()) {
                Collections.swap(flowerList, i, 0);
            }
        }
    }

    ArrayList search(FlowerSpec spec) {
        ArrayList matchingFlowers = new ArrayList();
        for (Iterator i = flowerList.iterator(); i.hasNext();) {
            Flower flower = (Flower)i.next();
            if (spec.getName() != flower.getName()) {
                continue;
            }
            if (spec.getFresh() != flower.getFresh()) {
                continue;
            }
            if (spec.getColor() != flower.getColor()) {
                continue;
            }
            matchingFlowers.add(flower);
        }
        return matchingFlowers;
    }

    public double price() {
        return price;
    }

    public String getDescription() {
        return "Size: " + size + " price: " + price + " ";
    }

}
