package strategyDesignPattern.core;

public class EatNotHungry implements Eat {
    @Override
    public void eat() {
        System.out.println("I wont eat");
    }
}
