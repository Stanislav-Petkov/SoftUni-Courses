package strategyDesignPattern.shared;

import strategyDesignPattern.model.Enemy;
import strategyDesignPattern.model.GameObject;
import strategyDesignPattern.model.Initializer;

public class EnemyFactory implements Factory {
    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Enemy.class);
        return new Enemy(params[0],params[1]);
    }
}
