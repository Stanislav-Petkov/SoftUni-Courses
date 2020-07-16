package factoryDesignPattern.core;

import factoryDesignPattern.data.DataStorage;
import factoryDesignPattern.model.GameObject;
import factoryDesignPattern.model.Initializer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<GameObject> gameObjects;

    public static void main(String[] args) throws InterruptedException {
        gameObjects = Initializer.init();

        DataStorage dataStorage = new DataStorage();


        boolean gameOver = false;

        while (!gameOver) {
            ArrayList<GameObject> copy = new ArrayList<>(Main.gameObjects);
            for (GameObject gameObject : copy) {
                gameObject.update();
                gameObject.render();
            }
            Thread.sleep(2000);
            //gameOver = 100 > 0;

        }
    }
}










