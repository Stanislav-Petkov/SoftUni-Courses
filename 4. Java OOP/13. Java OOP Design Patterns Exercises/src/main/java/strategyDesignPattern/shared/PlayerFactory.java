package strategyDesignPattern.shared;

import strategyDesignPattern.model.GameObject;
import strategyDesignPattern.model.Initializer;
import strategyDesignPattern.model.Player;

public class PlayerFactory implements Factory {
    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Player.class);
        return new Player(params[0],params[1]);
    }
}
