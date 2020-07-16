import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue05lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if ("cancel".equals(input)) {
            System.out.println("Printer is on standby");
        }
        Deque<String> queue = new ArrayDeque<>();

        while (!"print".equals(input)) {
            if ("cancel".equals(input) && !queue.isEmpty()) {
                String firstElement = queue.poll();
                System.out.println("Canceled " + firstElement);
            }
            if (!"cancel".equals(input) && !input.contains(" ")) {
                queue.offer(input);
            }
            input = scanner.nextLine();

            if ("cancel".equals(input) && queue.isEmpty()) {
                System.out.println("Printer is on standby");
            }
        }
        if (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                System.out.println(queue.poll());
            }
        }
    }
}

/*
//100
public class PrinterQueue05lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if("cancel".equals(input) ){
            System.out.println("Printer is on standby");
        }
        Deque<String> queue = new ArrayDeque<>();

        while (!"print".equals(input)){
            if("cancel".equals(input) && !queue.isEmpty()){
                String firstElement = queue.poll();
                System.out.println("Canceled " + firstElement);
            }
            if(!"cancel".equals(input) && !input.contains(" ")) {
                queue.offer(input);
            }
            input = scanner.nextLine();

            if("cancel".equals(input) && queue.isEmpty()){
                System.out.println("Printer is on standby");
            }
        }
        if(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                System.out.println(queue.poll());
            }
        }
    }
}
 */

