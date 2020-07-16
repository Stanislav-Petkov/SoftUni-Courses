package commandDesignPattern.shared;

import commandDesignPattern.model.GameObject;

import java.util.List;

public interface ProduceMultiple {
    List<GameObject> produce();

    public void setFactories(List<Factory> objectFactory);
}
