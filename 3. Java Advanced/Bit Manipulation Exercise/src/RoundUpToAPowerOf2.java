public class RoundUpToAPowerOf2 {
    public static void main(String[] args) {

        int n = 0b001000000101000;
        --n;
        n |= n >> 1;
        binaryToDecimal(n);
        System.out.println();
        n |= n >> 2;
        binaryToDecimal(n);
        System.out.println();
        n |= n >> 4;
        binaryToDecimal(n);
        System.out.println();
        n |= n >> 8;
        binaryToDecimal(n);
        System.out.println();
        n |= n >> 16;
        binaryToDecimal(n);
        System.out.println();
        n |= n >> 32;
        binaryToDecimal(n);
        System.out.println();

        ++n;

    }

    static void binaryToDecimal(int n) {
        if (n > 1) {
            binaryToDecimal(n / 2);
        }
        System.out.print(n % 2);
    }
}
