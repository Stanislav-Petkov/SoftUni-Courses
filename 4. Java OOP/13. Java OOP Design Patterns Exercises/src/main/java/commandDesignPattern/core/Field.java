package commandDesignPattern.core;

import commandDesignPattern.model.GameObject;

import static commandDesignPattern.core.Main.*;

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
/*

  private boolean checkCellMatch(int r, int c, int outsideRow, int outsideCol){
        return r == outsideRow && c == outsideCol;
    }



if(checkCellMatch(r,c, player.gerRow(),player.getCol())){
                    this.field[r][c] = 'P';
                }else if(checkCellMatch(r,c,enemy.gerRow(),enemy.getCol())){
                    this.field[r][c] = 'E';
                }else {
                    //there was a move
                    this.field[r][c] = '-';
                }
 */