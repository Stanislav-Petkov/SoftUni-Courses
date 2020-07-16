import java.util.Scanner;

public class TopNumber10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (double i = 0; i < n; i++) {
            if (i > 9) {
                double a =0;
                double b = 0;

                if(i>100){
                     a = (int) (i / 10); //1
                     b = i % 10; //7
                }else {
                     a = (int) (i / 10); //1
                     b = i % 10; //7
                }
                if (((a + b) % 8 == 0) && (a % 2 != 0 || b % 2 != 0)) {
                    System.out.printf("%.0f%.0f%n", a, b);
                }
            }
        }

        //String input = scanner.nextLine();
//        String[] inputNum = scanner.nextLine().split("");
//        int[] sum = new int [inputNum.length];
//        int sumOfNums = 0;
//        for (int i = 0; i < sum.length; i++) {
//            sum[i] = Integer.parseInt(inputNum[i]);
//            //
//            // sumOfNums += sum[i];
//        }
//        for (int i = 0; i < ; i++) {
//
//        }
        //  System.out.println(sumOfNums);
        //  for (int i = 0; i < sum.length; i++) {
        //     System.out.println(inputNum[i]);
        // }

    }
}


/*
//samo zero test minavat
Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (double i = 0; i < n; i++) {
            if (i > 9) {
                double a =0;
                double b = 0;

                if(i>100){
                     a = (int) (i / 10); //1
                     b = i % 10; //7
                }else {
                     a = (int) (i / 10); //1
                     b = i % 10; //7
                }
                if (((a + b) % 8 == 0) && (a % 2 != 0 || b % 2 != 0)) {
                    System.out.printf("%.0f%.0f%n", a, b);
                }
            }
        }
 */