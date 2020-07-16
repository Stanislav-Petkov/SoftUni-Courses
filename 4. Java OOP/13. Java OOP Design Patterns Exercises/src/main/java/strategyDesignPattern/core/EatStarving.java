package strategyDesignPattern.core;

public class EatStarving implements Eat {
    @Override
    public void eat() {
        System.out.println("I AM STARVING");
    }
}
