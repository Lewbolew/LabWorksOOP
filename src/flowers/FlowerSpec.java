package flowers;


import flowers.enums.FlowerColor;

public class FlowerSpec {
    protected String name = "NonName";
    protected FlowerColor color = FlowerColor.NON_COLOR;
    protected int stemLenght = 0;
    protected int price = 0;
    protected boolean isFresh = false;

    FlowerSpec(int price, int stemLenght,boolean isFresh, String name, FlowerColor color) {
        this.price = price;
        this.stemLenght = stemLenght;
        this.isFresh = isFresh;
        this.name = name;
        this.color = color;
    }

    public void setName(String n) {
        name = n;
    }
    public void setColor(FlowerColor flowerColor) {
        color = flowerColor;
    }
    public void setStemLenght(int s) {
        stemLenght = s;
    }
    public void setPrice(int p) {
        price = p;
    }
    public void setFresh(boolean f) {
        isFresh = f;
    }

    public String getName() {
        return name;
    }
    public FlowerColor getColor() {
        return color;
    }
    public int getStemLenght() {
        return stemLenght;
    }
    public int getPrice() {
        return price;
    }
    public boolean getFresh() {
        return isFresh;
    }

}
