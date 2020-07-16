package strategyDesignPattern.core;

public class GoatMain {
    public static void main(String[] args) {
        Goat goat1 = new Goat(new EatStarving());
        Goat goat2 = new Goat(new EatNotHungry());
        Goat goat3 = new Goat(new EatJunkFood());

        goat1.consumeFood();
        goat2.consumeFood();
        goat3.consumeFood();
    }
}
