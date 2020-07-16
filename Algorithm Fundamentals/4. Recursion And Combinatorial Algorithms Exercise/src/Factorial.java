import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(printFactorial(n));
        System.out.println(printFactorial1(n));
    }

    private static int printFactorial1(int n) {
        if(n == 0){
            return 1;
        }
        return n * printFactorial1(n - 1);
    }

    private static int printFactorial(int n) {
        if(n == 1){
            return 1;
        }

        return n  * printFactorial(n - 1);
    }
}
