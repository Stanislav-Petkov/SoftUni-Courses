package strategyDesignPattern.core;

public class Goat {
    private Eat eat;

    public Goat(Eat eat){
        this.eat = eat;
    }

    public void consumeFood(){
        this.eat.eat();;
    }
}
