public class ComputeTheMaskOfLeastSignificantMask {
    public static void main(String[] args) {
        int x = 0b0010000001010000;
        int r = -3;
        r = x & (-x);
        decimalToBinary(r);
        System.out.println();
    }

    static void decimalToBinary(int n) {
        if (n > 1) {
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}
