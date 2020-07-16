package JediGalaxy.jediGalaxy;

public class SithMovement implements Movement {

    @Override
    public long move(int row, int col, Filed filed) {
        while (row >= 0 && col >= 0) {
            if (filed.isInBounds(row, col)) {
                filed.setValue(row, col, 0);
            }
            row--;
            col--;
        }
        return 0;
    }
}
