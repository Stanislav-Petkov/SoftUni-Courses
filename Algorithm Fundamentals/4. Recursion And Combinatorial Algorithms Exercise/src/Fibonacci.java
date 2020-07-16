import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(printFibonacci(n));
    }

    private static int printFibonacci(int n) {
        if(n <= 1){
            return 1;
        }

        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }
}
