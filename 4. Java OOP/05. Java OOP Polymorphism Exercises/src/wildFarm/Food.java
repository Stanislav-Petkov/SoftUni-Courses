package wildFarm;

public abstract class Food {
    private int quantity;

    protected Food(int quantity) {
        this.quantity = quantity;
    }

    public abstract String getType();

    public int getQuantity() {
        return quantity;
    }
}
