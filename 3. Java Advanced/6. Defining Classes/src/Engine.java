public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power) {

        this.model = model;
        this.power = power;
        this.displacement = -1;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        String displacement = this.displacement == -1 ? "n/a" : String.valueOf(this.displacement);
        StringBuilder builder = new StringBuilder(this.model + ":")
                .append(System.lineSeparator())
                .append(String.format("Power: %d%n", this.power))
                .append(String.format("Displacement: %s%n", displacement))
                .append(String.format("Efficiency: %s%n", this.efficiency));
        return builder.toString();
    }
}
