package builder_pattern;

/**
 * Builder director.
 */
public class DirectorBuilder {
    private CarBuilder carBuilder;

    public DirectorBuilder(final CarBuilder builder) {
        this.carBuilder = builder;
    }

    public Car constuct() {
        carBuilder.setTintedWindows(true).setColor("Orange").getResult();
        return carBuilder.getResult();
    }

    public static void main(String[] args) {
        CarBuilder carBuilder = new CertainCarBuilder();
        DirectorBuilder carBuilderDir = new DirectorBuilder(carBuilder);
        System.out.println(carBuilderDir.constuct());
    }
}

