package strategyDesignPattern.stone;


import strategyDesignPattern.core.Main;
import strategyDesignPattern.shared.StoneFactory;

public class ThrowFast implements Throw {
    @Override
    public void throwStone() {
        Main.gameObjects.add(new StoneFactory().produceFastStone());

    }
}
