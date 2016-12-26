package builder_pattern;

/**
 * Abstraction of the Car Builder.
 */
public interface CarBuilder {
    CarBuilder setTintedWindows(final boolean tintedWindows);
    CarBuilder setColor(final String color);
    Car getResult();
}
