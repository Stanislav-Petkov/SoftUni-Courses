public class Test {
    public static void main(String[] args) {

        //Initial values
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise and
        // ~0101=1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);

        System.out.println("===============================");

        int q = 10;              //1010  = 10
        System.out.println(q>>1); // 0101  = 5
        System.out.println(q<<2);// 101000 = 32+8 = 40
        System.out.print(" 10 to binary " ); decimalToBinary(q);
        System.out.println();
        System.out.print(" q>>1  to binary " ); decimalToBinary(q>>1);
        System.out.println();
        System.out.print(" q<<2  to binary " ); decimalToBinary(q<<2);
        System.out.println();

        System.out.println("============== binary ");
        System.out.println(q<<30);
        int binary = 0b1011;
        System.out.println(binary<<1);  // 11 * 2 == 22

        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        decimalToBinary(0b10000>>3);
        System.out.println();
        decimalToBinary(0b10000<<3);
        System.out.println();
        System.out.println("-------");
        decimalToBinary(3<<0b10);
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
