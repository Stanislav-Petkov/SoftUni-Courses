package commandDesignPattern.shared;

import commandDesignPattern.model.Enemy;
import commandDesignPattern.model.GameObject;
import commandDesignPattern.model.Initializer;

public class EnemyFactory implements Factory {
    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Enemy.class);
        return new Enemy(params[0],params[1]);
    }
}
