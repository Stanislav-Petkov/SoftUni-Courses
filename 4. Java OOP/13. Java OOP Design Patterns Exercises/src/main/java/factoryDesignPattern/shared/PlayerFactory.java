package factoryDesignPattern.shared;

import factoryDesignPattern.model.GameObject;
import factoryDesignPattern.model.Initializer;
import factoryDesignPattern.model.Player;

public class PlayerFactory implements Factory {
    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Player.class);
        return new Player(params[0],params[1]);
    }
}
