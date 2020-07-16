import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<String> first = new ArrayList<>(Arrays.asList("abcd", "efgh", "ijkl", "mnop", "qrst", "uvwx", "yz"));
        List<String> first = new ArrayList<>();
        String[] firstInput = scanner.nextLine().split("\\s+");
        for (int i = 0; i < firstInput.length; i++) {
            first.add(firstInput[i]);
        }
        String[] input = scanner.nextLine().split("\\s+");
        while (true) {
            if (input[0].equals("3:1")) {
                break;
            }
            if (input[0].equals("merge")) {
                int startIndex = Integer.parseInt(input[1]);
                int endIndex = Integer.parseInt(input[2]);
                merge(first, startIndex, endIndex);
            }
            if (input[0].equals("divide")) {
                int index = Integer.parseInt(input[1]);
                int partitions = Integer.parseInt(input[2]);
                divide(first, index, partitions);
            }
            input = scanner.nextLine().split("\\s+");
        }
        System.out.println();
        for (int i = 0; i < first.size(); i++) {
            System.out.print(first.get(i) + " ");
        }
    }

    static List<String> divide(List<String> first, int index, int partitions) {
        List<String> divide = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            if (i == index) {
                String divideString = first.get(i);
                int lengthNewString = divideString.length() / partitions;
                int longest = divideString.length() % partitions;
                int counterSymbols = 0;
                String newString = "";
                for (int j = 0; j < divideString.length(); j++) {
                    char symbol = divideString.charAt(j);
                    newString += symbol;
                    counterSymbols++;
                    if (counterSymbols == lengthNewString) {
                        partitions--;
                        if (partitions == 0 && longest != 0) {
                            for (int k = 1; k <= longest; k++) {
                                newString += divideString.charAt(j + k);
                                divide.add(newString);
                            }
                            break;
                        }
                        divide.add(newString);
                        counterSymbols = 0;
                        newString = "";
                    }
                }
                break;
            }
        }
        first.remove(index);
        first.addAll(divide);
        return first;
    }

    static void merge(List<String> first, int startIndex, int endIndex) {
        if (startIndex < 0) {
            startIndex = 0;
        }
        if (endIndex > first.size() - 1) {
            endIndex = first.size() - 1;
        }
        for (int j = startIndex + 1; j <= endIndex; j++) {
            String current = first.get(startIndex);
            current += first.get(startIndex + 1);
            first.set(startIndex, current);
            first.remove(startIndex + 1);
        }
    }
}
