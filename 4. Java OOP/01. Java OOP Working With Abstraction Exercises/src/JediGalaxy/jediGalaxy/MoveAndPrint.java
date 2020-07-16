package JediGalaxy.jediGalaxy;

public class MoveAndPrint implements Movement {

    @Override
    public long move(int row, int col, Filed filed) {
        System.out.println("Print matrix here: ");
        for (int i = 0; filed.isInBounds(i, 0); i++) {
            for (int j = 0; filed.isInBounds(0, j); j++) {
                System.out.print(filed.getValue(i, j) + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
