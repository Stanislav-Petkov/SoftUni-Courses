package commandDesignPattern.model;

import commandDesignPattern.data.DataStorage;
import commandDesignPattern.shared.*;

import java.util.ArrayList;
import java.util.List;

public class Initializer {

    public static DataStorage dataStorage = new DataStorage();
    public static ProduceMultiple multiple = new InitialGameObjectFactory();
    public static List<Factory> objectFactory = new ArrayList<>();

    public static List<GameObject> init(){
        objectFactory.add(new PlayerFactory());
        objectFactory.add(new EnemyFactory());
        multiple.setFactories(objectFactory);
        return multiple.produce();
    }
}
