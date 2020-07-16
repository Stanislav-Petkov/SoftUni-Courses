public class PalindromeIntegers09Ex {
    static void reverse(int intArray[], int sizeOfIntArray) {
        int[] reversedArray = new int[sizeOfIntArray];
        int j = sizeOfIntArray;
        for (int i = 0; i < sizeOfIntArray; i++) {
            reversedArray[j - 1] = intArray[i];
            j = j - 1;
        }
        /*printing the reversed array*/
        boolean isFalse = false;
        for (int k = 0; k < sizeOfIntArray; k++) {
            if (reversedArray[k] != intArray[k]) {
                isFalse = true;
            }
        }
        if (isFalse) {
            System.out.println("false");
        } else {
            System.out.println("true");

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("END")) {
            return;
        }
        while (!input.equals("END")) {
            String[] stringNum = input.split("");
            int[] intNums = new int[stringNum.length];
            for (int i = 0; i < intNums.length; i++) {
                intNums[i] = Integer.parseInt(stringNum[i]);
            }
            // int[] arr = {10, 20, 30, 40, 50};
            reverse(intNums, intNums.length);
            input = scanner.nextLine();
        }
    }
}
