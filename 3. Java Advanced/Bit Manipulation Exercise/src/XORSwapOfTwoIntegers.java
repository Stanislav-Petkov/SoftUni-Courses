public class XORSwapOfTwoIntegers {
    public static void main(String[] args) {
        int x = 0b10111101;
        int y = 0b00101110;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        decimalToBinary(y);
        System.out.println();
        decimalToBinary(x);
        System.out.println();

        /*
        x = 10111101
        y = 00101110

        y = 10111101
        x = 00101110

        x = x ^ y;
        10111101 ^
        00101110 =
        x= 10010011

        y = x ^ y;
        10010011 ^
        00101110
        y=10111111

        x = x ^ y;
        10010011 ^
        10111111

        x =00101100

         */
    }
    static void decimalToBinary(int n){
        if(n > 1){
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}
