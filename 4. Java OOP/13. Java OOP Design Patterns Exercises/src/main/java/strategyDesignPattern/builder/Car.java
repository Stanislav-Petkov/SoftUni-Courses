package strategyDesignPattern.builder;

public class Car {
    private String make;
    private int hp;
    private int fuel;
    //TODO ADD 10 more fields

    public Car(){

    }
    public Car setMake(String make){
        this.make = make;
        return this;
    }

    public Car setHp(int hp) {
        this.hp = hp;
        return this;
    }

    public Car setFuel(int fuel) {
        this.fuel = fuel;
        return this;
    }
}
