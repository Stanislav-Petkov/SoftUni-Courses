package builderDesignPattern.shared;

import builderDesignPattern.model.GameObject;
import builderDesignPattern.model.Stone;

public class StoneFactory implements Factory {
    @Override
    public GameObject produce() {
        return new Stone();
    }
}
