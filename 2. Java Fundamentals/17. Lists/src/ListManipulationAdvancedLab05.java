public class ListManipulationAdvancedLab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumbers = new ArrayList<>();
        String[] inputNumbers = scanner.nextLine().split(" ");
        for (int i = 0; i < inputNumbers.length; i++) {
            listNumbers.add(Integer.parseInt(inputNumbers[i]));
        }
        String[] commandsInput = scanner.nextLine().split(" ");
        while (!commandsInput[0].equals("end")) {
            if (commandsInput[0].equals("Contains")) {
                if (listNumbers.contains(Integer.parseInt(commandsInput[1]))) {
                    System.out.print("Yes");
                } else {
                    System.out.print("No such number");
                }
            } else if (commandsInput[0].equals("Print") && commandsInput[1].equals("even")) {
                int evenNumber = 0;
                for (int i = 0; i < listNumbers.size(); i++) {
                    if (listNumbers.get(i) % 2 == 0) {
                        evenNumber = listNumbers.get(i);
                        System.out.print(evenNumber + " ");
                    }
                }
            } else if (commandsInput[0].equals("Print") && commandsInput[1].equals("odd")) {
                int oddNumber = 0;
                for (int i = 0; i < listNumbers.size(); i++) {
                    if (listNumbers.get(i) % 2 != 0) {
                        oddNumber = listNumbers.get(i);
                        System.out.print(oddNumber + " ");
                    }
                }
            } else if (commandsInput[0].equals("Get") && commandsInput[1].equals("sum")) {
                int sum = 0;
                for (int i = 0; i < listNumbers.size(); i++) {
                    sum += listNumbers.get(i);
                }
                System.out.print(sum + " ");
            } else if (commandsInput[0].equals("Filter") && commandsInput[1].equals("<")) {
                for (int i = 0; i < listNumbers.size(); i++) {
                    if (listNumbers.get(i) < Integer.parseInt(commandsInput[2])) {
                        System.out.print(listNumbers.get(i) + " ");
                    }
                }
            } else if (commandsInput[0].equals("Filter") && commandsInput[1].equals(">")) {
                for (int i = 0; i < listNumbers.size(); i++) {
                    if (listNumbers.get(i) > Integer.parseInt(commandsInput[2])) {
                        System.out.print(listNumbers.get(i) + " ");
                    }
                }
            } else if (commandsInput[0].equals("Filter") && commandsInput[1].equals("<=")) {
                for (int i = 0; i < listNumbers.size(); i++) {
                    if (listNumbers.get(i) <= Integer.parseInt(commandsInput[2])) {
                        System.out.print(listNumbers.get(i) + " ");
                    }
                }
            } else if (commandsInput[0].equals("Filter") && commandsInput[1].equals(">=")) {
                for (int i = 0; i < listNumbers.size(); i++) {
                    if (listNumbers.get(i) >= Integer.parseInt(commandsInput[2])) {
                        System.out.print(listNumbers.get(i) + " ");
                    }
                }
            }
            System.out.println();
            commandsInput = scanner.nextLine().split(" ");
        }
    }
}

