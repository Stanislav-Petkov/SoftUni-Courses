package factoryDesignPattern.shared;

import factoryDesignPattern.model.Enemy;
import factoryDesignPattern.model.GameObject;
import factoryDesignPattern.model.Initializer;

public class EnemyFactory implements Factory {
    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Enemy.class);
        return new Enemy(params[0],params[1]);
    }
}
