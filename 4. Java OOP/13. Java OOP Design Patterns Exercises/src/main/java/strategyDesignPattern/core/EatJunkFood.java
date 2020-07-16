package strategyDesignPattern.core;

public class EatJunkFood implements Eat {
    @Override
    public void eat() {
        System.out.println("I ate junk food");
    }
}
