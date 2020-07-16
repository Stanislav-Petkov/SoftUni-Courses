public class SetKthBit {
    public static void main(String[] args) {
        int x = 0b1011110101101101;
        int k = 7;
        int y = x | (1 << k);
        System.out.println(y);
        decimalToBinary(1 << k);
        System.out.println();
        decimalToBinary(y);
        System.out.println();
    }

    static void decimalToBinary(int n)
    {
        /* step 1 */
        if (n > 1)
            decimalToBinary(n/2);
        /* step 2 */
        System.out.print(n % 2);
    }

}
