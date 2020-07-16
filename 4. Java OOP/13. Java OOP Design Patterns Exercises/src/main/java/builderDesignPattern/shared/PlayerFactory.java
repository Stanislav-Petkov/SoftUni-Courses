package builderDesignPattern.shared;

import builderDesignPattern.model.GameObject;
import builderDesignPattern.model.Initializer;
import builderDesignPattern.model.Player;

public class PlayerFactory implements Factory {
    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Player.class);
        return new Player(params[0],params[1]);
    }
}
