public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = -1;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.model + ":")
                .append(System.lineSeparator())
                .append(engine.toString())
                .append("Weight: ")
                .append(this.weight == -1 ? "n/a" : String.valueOf(this.weight))
                .append(System.lineSeparator())
                .append(String.format("Color: %s", this.color));
        return builder.toString();
    }
}
