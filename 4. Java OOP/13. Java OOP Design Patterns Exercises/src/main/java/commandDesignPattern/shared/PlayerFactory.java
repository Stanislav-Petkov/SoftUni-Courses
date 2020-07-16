package commandDesignPattern.shared;

import commandDesignPattern.model.GameObject;
import commandDesignPattern.model.Initializer;
import commandDesignPattern.model.Player;

public class PlayerFactory implements Factory {
    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Player.class);
        return new Player(params[0],params[1]);
    }
}
