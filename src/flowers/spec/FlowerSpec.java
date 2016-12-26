package flowers.spec;

import flowers.enums.FlowerColor;
import flowers.parent.Spec;

/**
 * All fields and methods which can change we delivered into spec class
 */


public class FlowerSpec extends Spec {
    protected FlowerColor color = FlowerColor.NON_COLOR;
    protected boolean isFresh = false;

    public FlowerSpec(int price, int stemLenght, boolean isFresh, String name, FlowerColor color) {
        super(price, stemLenght, name);
        this.color = color;
        this.isFresh = isFresh;
    }

    public void setColor(FlowerColor flowerColor) {
        color = flowerColor;
    }
    public void setFresh(boolean isfr) {isFresh = isfr;}

    public FlowerColor getColor() {
        return color;
    }
    public boolean getIsFresh() {return isFresh;}

}

