package flowers.parent;

/**
 * Abstract class we use to make certain implementation fo Flower and Cactus classes.
 */
public abstract class Spec {
    protected String name = "NonName";
    protected int stemLenght = 0;
    protected int price = 0;

    public Spec(int price, int stemLenght, String name) {
        this.price = price;
        this.stemLenght = stemLenght;
        this.name = name;
    }

    public void setName(String n) {
        name = n;
    }
    public void setStemLenght(int s) {
        stemLenght = s;
    }
    public void setPrice(int p) {
        price = p;
    }

    public String getName() {
        return name;
    }
    public int getStemLength() {return stemLenght; }
    public int getPrice() {return price;}
}
