public class ExtractABitField {
    public static void main(String[] args) {
        int x = 0b1011110101101101;
        int shift = 7;
        int mask = 0b0000011110000000;
        int y = (x & mask) >> shift;
        decimalToBinary(x & mask);
        System.out.println();
        decimalToBinary((x & mask) >> shift);
    }

    static void decimalToBinary(int n) {
        if (n > 1) {
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}
