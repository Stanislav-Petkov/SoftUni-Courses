package commandDesignPattern.shared;

import commandDesignPattern.model.GameObject;
import commandDesignPattern.model.Stone;

public class StoneFactory implements Factory {
    @Override
    public GameObject produce() {
        return new Stone();
    }
}
