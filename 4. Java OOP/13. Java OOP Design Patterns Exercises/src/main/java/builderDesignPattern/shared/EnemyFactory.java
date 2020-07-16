package builderDesignPattern.shared;

import builderDesignPattern.model.Enemy;
import builderDesignPattern.model.GameObject;
import builderDesignPattern.model.Initializer;

public class EnemyFactory implements Factory {
    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Enemy.class);
        return new Enemy(params[0], params[1]);
    }
}
