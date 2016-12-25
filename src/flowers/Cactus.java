package flowers;

import flowers.enums.CactusShape;
import flowers.parent.Plant;
import flowers.spec.CactusSpec;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bohdan on 11/1/16.
 */
public class Cactus extends Plant{
    protected CactusSpec spec;
    static Map<CactusShape, Double> map = new HashMap<CactusShape, Double>();
    static {
        map.put(CactusShape.SQUARE, 10D);
        map.put(CactusShape.TRIANGLE, 15D);
        map.put(CactusShape.TYOCHUN_YAZYK, 20D);
        map.put(CactusShape.PODOVHASTYY, 25D);
        map.put(CactusShape.ROUND, 30D);
        map.put(CactusShape.RECTANGULAR, 35D);
        map.put(CactusShape.FORMLESS, 5D);
    }

    Cactus(CactusSpec spec) {
        this.spec = spec;
    }

    public String getName() {
        return spec.getName();
    }
    public CactusShape getCactusShape() {
        return spec.getCactusShape();
    }
    public int getStemLength() {
        return spec.getStemLength();
    }
    public int getPrice() {
        return spec.getPrice();
    }

    @Override
    public String toString() {
        return "Name " + spec.getName() + " price is " + spec.getPrice() + " form is " + spec.getCactusShape() + " stem llength " + spec.getStemLength();
    }

    @Override
    public double calculatePrice() {
        return Cactus.map.get(getCactusShape()) + 50;
    }
}
