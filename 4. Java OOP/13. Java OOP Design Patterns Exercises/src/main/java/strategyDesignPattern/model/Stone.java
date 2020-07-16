package strategyDesignPattern.model;

import strategyDesignPattern.core.Main;
import strategyDesignPattern.shared.Movable;

public class Stone implements GameObject, Movable {
    private int row;
    private int col;
    private int prevRow; //the stone is moving only with row--
    private int speed;

    public Stone() {
        this.row = Main.player.gerRow();
        this.prevRow = this.row;
        this.col = Main.player.getCol();
        this.speed = 1;
    }

    @Override
    public void update() {
        if (this.row >= 0) {
            this.prevRow = this.row;
            this.row -= speed;
        }
    }

    @Override
    public void render() {
        if (this.row > -1) {
            Main.field.field[this.prevRow][this.col] = '-';
            Main.field.field[this.row][this.col] = 'S';
        }
    }


    @Override
    public int gerRow() {
        return 0;
    }

    @Override
    public int getCol() {
        return 0;
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

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
}
