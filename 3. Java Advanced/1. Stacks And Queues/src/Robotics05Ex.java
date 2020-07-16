import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputRobots = scanner.nextLine().split(";");
        int[] processTimes = new int[inputRobots.length];
        String inputTime = scanner.nextLine();
        if (inputTime.length() == 7) {
            inputTime = "0" + inputTime;
        }

        Map<String, Integer> robots = splitRobotsByNameandTimeValue(inputRobots);

        ArrayDeque<String> products = new ArrayDeque<>();
        String line = scanner.nextLine();
        while (!"End".equals(line)) {
            products.offer(line);
            line = scanner.nextLine();
        }

        LocalTime time = LocalTime.parse(inputTime);
        while (!products.isEmpty()) {
            time = time.plusSeconds(1);
            String current = products.poll();
            decreaseProcessTime(processTimes);
            if (!assignJob(robots, processTimes, current, time)) {
                products.offer(current);
            }
        }
    }

    private static boolean assignJob(Map<String, Integer> robots, int[] processTimes, String current, LocalTime time) {
        for (int i = 0; i < processTimes.length; i++) {

            if (processTimes[i] == 0) {
                int count = 0;
                for (Map.Entry<String, Integer> entry : robots.entrySet()) {
                    if (count == i) {
                        processTimes[i] = entry.getValue();
                        logJobAssigned(entry.getKey(), current, time);
                        return true;
                    }
                    count++;
                }
            }

        }
        return false;
    }

    private static void logJobAssigned(String name, String product, LocalTime time) {
        String format = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(String.format("%s - %s [%s]", name, product, time));
    }

    private static void decreaseProcessTime(int[] processTimes) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] > 0) {
                --processTimes[i];
            }
        }
    }

    private static Map<String, Integer> splitRobotsByNameandTimeValue(String[] inputRobots) {
        Map<String, Integer> robots = new LinkedHashMap<>();
        for (int i = 0; i < inputRobots.length; i++) {
            String line = inputRobots[i];
            int dashIndex = line.indexOf("-");
            String name = line.substring(0, dashIndex);
            int time = Integer.parseInt(line.substring(dashIndex + 1));
            robots.put(name, time);
        }
        return robots;
    }
}
