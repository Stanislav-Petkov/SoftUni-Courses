package JediGalaxy.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner.nextLine());

        Movement jediMovement = new MoveAndPrint();
        Movement sithMovement = new SithMovement();

        Galaxy galaxy = new Galaxy(new Filed(dimensions[0], dimensions[1]), jediMovement, sithMovement);

        String positions = scanner.nextLine();
        long starPowerCollected = 0;
        while (!positions.equals("Let the Force be with you")) {

            int[] jediPositions = readPositions(positions);
            int[] sithPosition = readPositions(scanner.nextLine());

            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

            int rowSith = sithPosition[0];
            int colSith = sithPosition[1];
            galaxy.moveSith(rowSith, colSith);

            starPowerCollected += galaxy.moveJedi(rowJedi, colJedi);
            positions = scanner.nextLine();
        }
        System.out.println(starPowerCollected);
    }

    private static boolean isInBounds(int row, int col, int[][] galaxy) {
        return row >= 0 && row < galaxy.length && col >= 0 && col < galaxy[row].length;
    }

    private static int[] readPositions(String positions) {
        return Arrays.stream(positions.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
