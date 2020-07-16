import java.util.Scanner;

public class EasterEggs05ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double paintedEgs = Double.parseDouble(scanner.nextLine());
        String color = scanner.nextLine();
        double redCnt = 0;
        double orangeCnt = 0;
        double blueCnt = 0;
        double greenCnt = 0;
        String maxColor = "";
        double max = -1;
        for (int i = 1; i <= paintedEgs; i++) {
            if (color.equals("red")) {
                redCnt++;
            } else if (color.equals("orange")) {
                orangeCnt++;
            } else if (color.equals("blue")) {
                blueCnt++;
            } else if (color.equals("green")) {
                greenCnt++;
            }
            if (redCnt > max) {
                max = redCnt;
                maxColor = "red";
            } else if (orangeCnt > max) {
                max = orangeCnt;
                maxColor = "orange";
            } else if (blueCnt > max) {
                max = blueCnt;
                maxColor = "blue";
            } else if (greenCnt > max) {
                max = greenCnt;
                maxColor = "green";
            }
            if (i == paintedEgs) {
                break;
            }
            color = scanner.nextLine();
        }
        System.out.printf("Red eggs: %.0f%n", redCnt);
        System.out.printf("Orange eggs: %.0f%n", orangeCnt);
        System.out.printf("Blue eggs: %.0f%n", blueCnt);
        System.out.printf("Green eggs: %.0f%n", greenCnt);
        System.out.printf("Max eggs: %.0f -> %s", max, maxColor);
    }
}
