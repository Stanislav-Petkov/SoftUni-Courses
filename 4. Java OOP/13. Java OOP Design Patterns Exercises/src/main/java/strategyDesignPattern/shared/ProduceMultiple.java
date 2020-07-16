package strategyDesignPattern.shared;

import strategyDesignPattern.model.GameObject;

import java.util.List;

public interface ProduceMultiple {
    List<GameObject> produce();

    public void setFactories(List<Factory> objectFactory);
}
