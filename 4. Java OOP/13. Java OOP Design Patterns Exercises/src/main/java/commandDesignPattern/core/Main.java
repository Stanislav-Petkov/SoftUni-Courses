package commandDesignPattern.core;

import commandDesignPattern.command.CommandInterpreter;
import commandDesignPattern.command.CommandListener;
import commandDesignPattern.data.DataStorage;
import commandDesignPattern.model.Enemy;
import commandDesignPattern.model.GameObject;
import commandDesignPattern.model.Initializer;
import commandDesignPattern.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<GameObject> gameObjects;
    public static Player player;
    public static Enemy enemy;
    public static Field field;

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        gameObjects = Initializer.init();

        for(GameObject gameObject : gameObjects){
            if(gameObject instanceof Player){
                player = (Player) gameObject;
            }else if(gameObject instanceof Enemy){
                enemy = (Enemy) gameObject;
            }else if(gameObject instanceof Field){
                field = (Field) gameObject;
            }
        }

        CommandListener handler = new CommandInterpreter();

        DataStorage dataStorage = new DataStorage();

        String input = "";

        boolean gameOver = false;

        while (!gameOver) {
            ArrayList<GameObject> copy = new ArrayList<>(Main.gameObjects);
            for (GameObject gameObject : copy) {
                gameObject.update();
                gameObject.render();
            }
            Thread.sleep(500);
            //gameOver = 100 > 0;
            System.out.println();
            System.out.println();
            System.out.println("=================================");
            System.out.println("Enter new command: ");
            input = scanner.nextLine();
            try {
                handler.handleCommand(input);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            System.out.println();
            System.out.println();
        }
    }
    /*
    Commands
    w => move player up
    s => move player down
    a => move player left
    d => move player right
    f => player fires
     */
}





/*
        gameObjects.add(new Player(dataStorage.load(Player.class)[0],dataStorage.load(Player.class)[1]));
        gameObjects.add(new Enemy(dataStorage.load(Enemy.class)[0],dataStorage.load(Enemy.class)[1]));
 */











