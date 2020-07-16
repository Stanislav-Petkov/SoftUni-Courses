package JediGalaxy.greedyTimes;

public class Bag {
    private Gold gold;
    private CashContainer cashContainer;
    private GemContainer gemContainer;
    private long capacity;

    public Bag(long capacity) {
        this.gold = new Gold();
        this.cashContainer = new CashContainer();
        this.gemContainer = new GemContainer();
        this.capacity = capacity;
    }

    public boolean hasRoomFor(Long value) {
        return value + this.getCurrentSize() <= capacity;
    }

    private Long getCurrentSize() {
        long size = this.gold.getValue();
        size += this.cashContainer.getValue();
        size += this.gemContainer.getSize();
        return size;
    }

    public void addGold(long value) {
        this.gold.addValue(value);
    }

    public void addCash(long value) {
        if (this.gold.getValue() >= this.cashContainer.getValue() + value) {
        }
    }
}
