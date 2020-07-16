package task1BinomialCoefficients;

import java.util.Scanner;

public class BinomialCoefficientsRecursiveMemoization {

    public static long memory[][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // row
        int k = Integer.parseInt(scanner.nextLine()); // col

        memory = new long[n + 1][k + 1];

        long binom = binomCalc(n, k);

        System.out.println(binom);
    }

    public static long binomCalc(int n, int k){
        if(k == 0 || k == n){
            return 1;
        }

        if(memory[n][k] != 0){
            // When there is already a value in the memory , I want to return it
            return memory[n][k];
        }

        return  memory[n][k] = binomCalc(n - 1, k) + binomCalc(n - 1, k - 1);
    }
}


