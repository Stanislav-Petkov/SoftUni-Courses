package factoryDesignPattern.shared;

import factoryDesignPattern.model.GameObject;

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
            gameObjects.add(objectFactory.produce());//.produce vrushta obekt
        }
        return gameObjects;

    }
    @Override
    public void setFactories(List<Factory> objectFactories){
        this.objectFactories = objectFactories;
    }
}
