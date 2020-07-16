public class SetABitField {
    public static void main(String[] args) {
        int x = 0b1011110101101101;
        int y = 0b0000000000000011;
        int mask = 0b0000011110000000;
        int shift = 7;
        x = (x & ~mask) | (y << shift);
        decimalToBinary(x);

        /*
                        int x =    10111 1010 1101101
                       int y =     00000 0000 0000011
                    int mask =     00000 1111 0000000
                    ~mask =        11111 0000 1111111
                    (x & ~mask)    10111 0000 1101101
                    y << shift     00000 0011 0000000
     (x & ~mask) | (y << shift)    10111 0011 1101101 samo 0 | 0 = 0
     for safety   instead of (y << shift) we should use ((y << shift) & mask)
         */
    }

    private static void decimalToBinary(int x) {
        if (x > 1) {
            decimalToBinary(x / 2);
        }
        System.out.print(x % 2);
    }
}
