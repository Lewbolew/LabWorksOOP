package builder_pattern;

/**
 * Represents the product created by the builder.
 */
public class Car {
    private boolean tintedWindows;
    private String color;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car [windows is tinted: " + tintedWindows + ", color = " + color + "]";
    }

    public boolean getTintedWindows() {
        return tintedWindows;
    }

    public void setTintedWindows(boolean isTinted) {
        tintedWindows = isTinted;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
