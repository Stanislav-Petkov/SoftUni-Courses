public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int number = 11;
        int i = 0;
        int[] binary = new int[100];
        while (number != 0) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print("" + binary[j]);
        }
        System.out.println("==================");
        int counter = 0;
        for (int j = 0; j < i; j++) {
            if (binary[j] == 1) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
