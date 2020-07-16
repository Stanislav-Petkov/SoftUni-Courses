public class Add1toABinaryNum {
    public static void main(String[] args) {
        int x = 0b11001011;
        System.out.println(addOne(x));
        int b = 204;
    }

    static int addOne(int x) {
        int m = 1;
        while ((x & m) >= 1) {
            decimalToBinary(x & m);
            System.out.println();
            x = x ^ m;
            decimalToBinary(x);
            System.out.println();
            m <<= 1;
            decimalToBinary(m);
            System.out.println(" End ");
        }
        x = x ^ m;
        return x;
    }

    static void decimalToBinary(int n) {
        if (n > 1) {
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}
