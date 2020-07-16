package JediGalaxy.jediGalaxy;

public class JediMovement implements Movement {

    @Override
    public long move(int row, int col, Filed filed) {
        long collectedPower = 0;
        while (row >= 0 && col < filed.getColLength(1)) {
            if (filed.isInBounds(row, col)) {
                collectedPower += filed.getValue(row, col);
            }
            row--;
            col++;
        }
        return collectedPower;
    }
}
