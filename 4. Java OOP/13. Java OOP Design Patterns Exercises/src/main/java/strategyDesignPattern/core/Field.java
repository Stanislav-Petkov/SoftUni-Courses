package strategyDesignPattern.core;

import strategyDesignPattern.model.GameObject;

public class Field implements GameObject {
    public char[][] field;

    public Field(){
        this.field = new char[16][16];
        for (int row = 0; row < 16; row++) {
            for (int col = 0; col < 16; col++) {
                this.field[row][col] = '-';
            }
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {
        for (int r = 0; r < 16; r++) {
            for (int c = 0; c < 16; c++) {
                System.out.print(this.field[r][c] + " ");
            }
            System.out.println();
        }
    }
}
