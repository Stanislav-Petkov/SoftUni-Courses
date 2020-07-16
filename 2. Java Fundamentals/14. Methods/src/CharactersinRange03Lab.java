public class CharactersinRange03Lab {
    static void printCharactersAsci(int first, int second) {
        String output = "";
        for (char symbol = (char) (first + 1); symbol < second; symbol++) {
            output += symbol + " ";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        printCharactersAsci(Math.min(first, second), Math.max(first, second));
    }
}
