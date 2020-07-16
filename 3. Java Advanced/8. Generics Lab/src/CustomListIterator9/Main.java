package CustomListIterator9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        while (!line.equals("END")) {
            String[] tokens = line.split(" ");
            String commandType = tokens[0];
            switch (commandType) {
                case "Add":
                    list.add(tokens[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(tokens[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(tokens[1]),
                            Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    // list.print();
                    list.forEach(System.out::println);
                    break;
                case "Sort":
                    list.sort();
                    break;

            }
            line = scanner.nextLine();
        }
    }
}

