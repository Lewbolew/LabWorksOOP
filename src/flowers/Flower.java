package flowers;

import flowers.enums.FlowerColor;
import flowers.parent.Plant;

import java.util.HashMap;
import java.util.Map;

/**
 * Certain implementation of the Flower.
 */
public class Flower extends Plant{
    protected FlowerSpec spec;
    static Map<FlowerColor, Double> map = new HashMap<FlowerColor, Double>();
    static {
        map.put(FlowerColor.RED, 10D);
        map.put(FlowerColor.GREEN, 15D);
        map.put(FlowerColor.YELLOW, 20D);
        map.put(FlowerColor.BLUE, 25D);
        map.put(FlowerColor.PINK, 30D);
        map.put(FlowerColor.ORANGE, 35D);
        map.put(FlowerColor.WHITE, 5D);
        map.put(FlowerColor.NON_COLOR, 0D);
        map.put(FlowerColor.PURPLE, 40D);
    }
    public Flower(FlowerSpec spec) {this.spec = spec;}

    public String getName() {
        return spec.name;
    }
    public FlowerColor getColor() {
        return spec.color;
    }
    public int getStemLength() {
        return spec.stemLenght;
    }
    public int getPrice() {
        return spec.price;
    }
    public boolean getFresh() {
        return spec.isFresh;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " color is " + String.valueOf(getColor()) + " it`s stem length is " + String.valueOf(getStemLength() + " it`s price is " + String.valueOf(getPrice() + " it`s freshness is " + String.valueOf(getFresh())));
    }
    
    @Override
    public double calculatePrice() {
        return getPrice() + map.get(spec.getColor());
    }
}
