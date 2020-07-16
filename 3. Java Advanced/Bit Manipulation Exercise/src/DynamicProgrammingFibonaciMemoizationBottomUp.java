public class DynamicProgrammingFibonaciMemoizationBottomUp {

    public static void main(String[] args) {
        int n = 4;
        Integer[] memo = new Integer[n + 1];
        System.out.println(fib(n, memo));
    }

    private static int fib(int n, Integer[] memo) {
        int result = 0;
        if (memo[n] != null) {
            return memo[n];
        }
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = fib(n - 1, memo) + fib(n - 2, memo);
        }
        memo[n] = result;
        return result;
    }
}
