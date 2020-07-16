
import java.util.Scanner;

public class ChangeTiles03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groundSide = Integer.parseInt(scanner.nextLine());
        double groundArea = groundSide * groundSide;
        double widthOfTile = Double.parseDouble(scanner.nextLine());
        double lengthOfTile = Double.parseDouble(scanner.nextLine());
        int widthOfBench = Integer.parseInt(scanner.nextLine());
        int lengthOfBench = Integer.parseInt(scanner.nextLine());
        double AreaForWork = groundArea - (widthOfBench * lengthOfBench);
        double numOfTiles = AreaForWork / (widthOfTile * lengthOfTile);
        double minutes = numOfTiles * 0.2;
        System.out.println(numOfTiles);
        System.out.println(minutes);
    }
}
