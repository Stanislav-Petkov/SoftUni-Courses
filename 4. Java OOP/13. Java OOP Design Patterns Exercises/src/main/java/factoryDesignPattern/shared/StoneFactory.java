package factoryDesignPattern.shared;

import factoryDesignPattern.model.GameObject;
import factoryDesignPattern.model.Stone;

public class StoneFactory implements Factory {
    @Override
    public GameObject produce() {
        return new Stone();
    }
}
