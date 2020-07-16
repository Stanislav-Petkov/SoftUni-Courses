public class TestRecursion {
    public static void main(String[] args) {
        int n = 5;
        f(n);
    }

    static void f(int n) {
        if (n > 0) {
            f(n - 1);
        }
        System.out.println("Completed call " + n);
    }
}
