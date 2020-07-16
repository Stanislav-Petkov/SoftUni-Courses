import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersToDdd = scanner.nextInt();
        int numbersToRemove = scanner.nextInt();
        int numberToCheck = scanner.nextInt();
        scanner.nextLine();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numbersToDdd; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < numbersToRemove; i++) {
            queue.poll();
        }
        if (queue.contains(numberToCheck)) {
            System.out.println("true");
        } else {
            int n = queue.stream()
                    .min(Integer::compareTo)
                    .orElse(0);
            System.out.println(n);
        }
    }
}

/*
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersToDdd = scanner.nextInt();
        int numbersToRemove = scanner.nextInt();
        int numberToCheck = scanner.nextInt();
        scanner.nextLine();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numbersToDdd ; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < numbersToRemove; i++) {
            queue.poll();
        }
        if(queue.contains(numberToCheck)){
            System.out.println("true");
        }else {
            int n = queue.stream()
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

public class BasicQueueOperations04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersToDdd = scanner.nextInt();
        int numbersToRemove = scanner.nextInt();
        int numberToCheck = scanner.nextInt();
        scanner.nextLine();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numbersToDdd ; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < numbersToRemove; i++) {
            queue.poll();
        }
        if(queue.contains(numberToCheck)){
            System.out.println("true");
        }else {
            if(queue.isEmpty()){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}

 */