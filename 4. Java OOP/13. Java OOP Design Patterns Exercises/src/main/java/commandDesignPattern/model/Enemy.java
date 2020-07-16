package commandDesignPattern.model;

import commandDesignPattern.core.Main;
import commandDesignPattern.shared.Movable;

public class Enemy implements GameObject, Movable {

    private int healthPoints;
    private int damage;
    private int row;
    private int col;

    public Enemy(int healthPoints, int damage){
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.row = 0;
        this.col = 7;
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {
        Main.field.field[this.row][this.col] = 'E';
    }

    @Override
    public int gerRow() {
        return this.row;
    }

    @Override
    public int getCol() {
        return this.col;
    }

    @Override
    public void decreaseRow() {

    }

    @Override
    public void decreaseCol() {

    }

    @Override
    public void increaseRow() {

    }

    @Override
    public void increaseCol() {

    }
}
