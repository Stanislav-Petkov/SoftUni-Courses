public class ToggleTheKthBitWithXOR {
    public static void main(String[] args) {
        int x = 0b1011110101101101;
        int k = 7;
        int y = x ^ (1 << k);

        System.out.println(1 << 0); // 00001  = 1
        System.out.println(1 << 1); // 00010  = 2
        System.out.println(1 << 2); // 00100  = 4
        System.out.println(" function:  ");
        decimalToBinary(y);
        System.out.println();
        System.out.println();

        //x             10111101 0 1101101   0 => 0 ^ 0 = 0 ,1 ^ 1 = 0
        //(1 << 7)      00000000 1 0000000
        //
        //x ^ (1 << k)  10111101 1 1101101  1 => 0 ^ 1 = 1 ,0 ^ 1 = 1
        //decimalToBinary(~(1 << 2)); // 00100  = 4
        //System.out.println(1 << 2); // 00100  = 4

    }

    static void decimalToBinary(int n) {
        if (n > 1) {
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}
