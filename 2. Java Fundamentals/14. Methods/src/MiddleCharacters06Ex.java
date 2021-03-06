
class MiddleCharacters06Ex {

    private static String getMiddleString(String input) {
        if (input.length() % 2 == 0) {
            char middle = input.charAt((input.length() / 2) - 1);
            char middlePlusOne = input.charAt(input.length() / 2);
            return "" + middle + middlePlusOne;
        } else {
            return "" + input.charAt(input.length() / 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(getMiddleString(input));
    }
}