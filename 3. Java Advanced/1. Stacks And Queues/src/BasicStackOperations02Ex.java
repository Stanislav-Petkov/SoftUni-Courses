import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int numbersToPush = scanner.nextInt();
        int numbersToPop = scanner.nextInt();
        int numberToCheck = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numbersToPush; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.contains(numberToCheck)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(stack));
            }
        }

    }
}

/*
import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int numbersToPush = scanner.nextInt();
        int numbersToPop = scanner.nextInt();
        int numberToCheck = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numbersToPush; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.contains(numberToCheck)) {
            System.out.println("true");
        } else {
            int n = stack.stream()
                    .mapToInt(e -> e)
                    .min()
                    .orElse(0);
            System.out.println(n);
        }
    }
}
 */
/*
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int numbersToPush = scanner.nextInt();
        int numbersToPop = scanner.nextInt();
        int numberToCheck = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numbersToPush; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.contains(numberToCheck)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}


 */
/*
//100

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] inputStr = scanner.nextLine().split("\\s+");
        int numberOfElementsToPush = Integer.parseInt(inputStr[0]);
        int numberOfElementsToPop = Integer.parseInt(inputStr[1]);
        int numberToCheck = Integer.parseInt(inputStr[2]);
        String [] inputNums = scanner.nextLine().split("\\s+");
        for (int i = 0; i < numberOfElementsToPush; i++) {
            stack.push(Integer.parseInt(inputNums[i]));
        }
        for (int i = 0; i < numberOfElementsToPop; i++) {
            stack.pop();
        }
        int stackS = stack.size();
        if(stackS == 0){
            System.out.println(0);
            return;
        }
        if(stack.contains(numberToCheck)){
            System.out.println("true");
        }else {
            int[] findSmallest = new int[stackS];
            for (int i = 0; i < stackS; i++) {
                findSmallest[i] = stack.pop();
            }
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < stackS; i++) {
                if(findSmallest[i] < smallest){
                    smallest = findSmallest[i];
                }
            }
            System.out.println(smallest);
        }


    }
}

 */
