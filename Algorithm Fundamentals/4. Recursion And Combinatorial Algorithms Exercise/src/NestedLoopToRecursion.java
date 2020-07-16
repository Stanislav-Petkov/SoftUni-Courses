import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a program that simulates the execution of n nested loops from 1 to n
 * which prints the values of all its iteration variables at any given time on a single line. Use recursion.
 * Input	Output
 * 2	     1 1
 *           1 2
 *           2 1
 *           2 2
 */
public class NestedLoopToRecursion {
    public static int[] arr;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        arr = new int[n];
        permute(0);
    }

    private static void permute(int index) {
        if(index == arr.length){
            printArr();
        }else{
            for (int i = 1; i <= n ; i++) {
                arr[index] = i;
                permute(index + 1);
            }
        }
    }

    private static void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
















