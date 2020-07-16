package strategyDesignPattern.shared;

import strategyDesignPattern.model.GameObject;
import strategyDesignPattern.model.Stone;

public class StoneFactory implements Factory {
    @Override
    public GameObject produce() {
        return new Stone();
    }

    public GameObject produceFastStone(){
        Stone stone = new Stone();
        stone.setSpeed(4);
        return stone;
    }

}
