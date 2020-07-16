
public class MidExam2nov19WizardPoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> deck = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\:")));
        List<String> newDeck = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("Ready")) {
            String[] inputValues = command.split(" ");
            String action = inputValues[0];
            String actionReverse = inputValues[0] + " " + inputValues[1];
            switch (action) {
                case "Add":
                    String cardForAdding = inputValues[1];
                    if (deck.contains(cardForAdding)) {
                        newDeck.add(cardForAdding);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    String cardForInserting = inputValues[1];
                    if (deck.contains(cardForInserting)) {
                        newDeck.add(0, cardForInserting);
                    }
                    int index = Integer.parseInt(inputValues[2]);
                    if (!isIndexValid(index, newDeck) || !deck.contains(cardForInserting)) {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    String removeCard = inputValues[1];
                    if (!newDeck.contains(removeCard)) {
                        System.out.println("Card not found.");
                    } else {
                        newDeck.remove(removeCard);
                    }
                    break;
                case "Swap":
                    String firstCard = inputValues[1];
                    String secondCard = inputValues[2];
                    int positionFirstCard = newDeck.indexOf(firstCard);
                    int positionSecondCard = newDeck.indexOf(secondCard);
                    Collections.swap(newDeck, positionFirstCard, positionSecondCard);
                    break;
            }
            if (actionReverse.equals("Shuffle deck")) {
                Collections.reverse(newDeck);
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < newDeck.size(); i++) {
            System.out.print(newDeck.get(i) + " ");
        }
    }

    private static boolean isIndexValid(int indexCheck, List<String> warList) {
        return indexCheck >= 0 && indexCheck < warList.size();
    }
}
