package builderDesignPattern.shared;

import builderDesignPattern.model.GameObject;

import java.util.List;

public interface ProduceMultiple {
    List<GameObject> produce();

    public void setFactories(List<Factory> objectFactory);
}
