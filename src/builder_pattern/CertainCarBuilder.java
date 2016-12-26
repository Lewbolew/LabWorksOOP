package builder_pattern;

/**
 * Certain implementation of the car builder.
 */
public class CertainCarBuilder implements CarBuilder{
    private Car car;
    public CertainCarBuilder() {
        car = new Car();
    }
    @Override
    public CarBuilder setTintedWindows(final boolean tintedWindows) {
        car.setTintedWindows(tintedWindows);
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car getResult() {
        return car;
    }
}
