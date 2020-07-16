import java.util.stream.Collectors;

public class Train01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].contains("end")) {
                break;
            }
            if (input[0].contains("Add")) {
                wagonList.add(Integer.parseInt(input[1]));
            } else {
                for (int i = 0; i < wagonList.size(); i++) {
                    int wagonContent = wagonList.get(i);
                    int inputNum = Integer.parseInt(input[0]);
                    if ((maxCapacity - wagonContent) >= inputNum) {
                        wagonList.set(i, inputNum + wagonContent);
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < wagonList.size(); i++) {
            System.out.print(wagonList.get(i) + " ");
        }
    }
}
