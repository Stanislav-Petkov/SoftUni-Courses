import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wagonList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        while (true) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input[0].contains("end")) {
                break;
            }
            if (input[0].contains("Delete")) {
                wagonList.removeAll(Collections.singleton(input[1]));
            } else if (input[0].contains("Insert")) {
                int position = Integer.parseInt(input[2]);
                if (position >= 0 && position < wagonList.size()) {
                    wagonList.add(Integer.parseInt(input[2]), input[1]);
                }
            }
        }
        for (int i = 0; i < wagonList.size(); i++) {
            System.out.print(wagonList.get(i) + " ");
        }
    }
}
