import java.util.Scanner;

public class Walking04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10_000;
        int totalSteps = 0;
        boolean missionAccomplished = false;
        while (totalSteps < goal) {
            String line = scanner.nextLine();
            if (line.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps += steps;
                if (totalSteps >= goal) {
                    missionAccomplished = true;
                } else {
                    System.out.println((goal - totalSteps) + " more steps to reach goal.");
                    break;
                }
            } else {
                int currentSteps = Integer.parseInt(line);
                totalSteps += currentSteps;
                if (totalSteps >= goal) {
                    missionAccomplished = true;
                }
            }
        }
        if (missionAccomplished) {
            System.out.println("Goal reached! Good job!");
        }
    }
}
