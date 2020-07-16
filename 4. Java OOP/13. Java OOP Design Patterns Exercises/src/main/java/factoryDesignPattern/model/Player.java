package factoryDesignPattern.model;

import factoryDesignPattern.core.Main;
import factoryDesignPattern.shared.Factory;
import factoryDesignPattern.shared.StoneFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Player implements GameObject {
    private int healthPoints;
    private int damage;
    private Factory factory;

    public Player(int healthPoints, int damage){
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.factory = new StoneFactory();
    }

    public void update() {

        int nextInt = ThreadLocalRandom.current().nextInt(1000);

        if(nextInt % 3 == 0){
            //the player creates a stone and adds it to the initial objects
            Main.gameObjects.add(this.factory.produce());
        }else if(nextInt % 5 == 0){
            Main.gameObjects.removeIf(gameObject -> gameObject.getClass().getSimpleName().equals("Stone"));
        }

        System.out.println("Player updated");
    }

    public void render() {
        System.out.println("Player rendered");
    }
}
