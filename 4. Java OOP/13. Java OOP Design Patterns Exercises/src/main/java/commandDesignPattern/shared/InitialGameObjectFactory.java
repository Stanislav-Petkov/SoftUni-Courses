package commandDesignPattern.shared;

import commandDesignPattern.core.Field;
import commandDesignPattern.model.GameObject;

import java.util.ArrayList;
import java.util.List;

public class InitialGameObjectFactory implements ProduceMultiple {

    private List<Factory> objectFactories;

    public InitialGameObjectFactory(){
        this.objectFactories = new ArrayList<>();
    }

    @Override
    public List<GameObject> produce() {
        List<GameObject> gameObjects = new ArrayList<>();
        for (Factory objectFactory : objectFactories) {
            gameObjects.add(objectFactory.produce());
        }

        gameObjects.add(new Field());

        return gameObjects;

    }
    @Override
    public void setFactories(List<Factory> objectFactories){
        this.objectFactories = objectFactories;
    }
}
