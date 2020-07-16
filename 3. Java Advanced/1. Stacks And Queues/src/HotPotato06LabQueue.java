import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato06LabQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String childNames = readChildNames(scanner);
        String[] splitChildren = childNames.split("\\s+");
        int tossesToRemoveOn = readTossesNumber(scanner);
        Deque<String> queue = new ArrayDeque<>(Arrays.asList(splitChildren));

        int currentTosses = 1;
        while (queue.size() > 1) {
            String currentChild = queue.poll();
            if (currentTosses % tossesToRemoveOn != 0) {
                queue.offer(currentChild);
            } else {
                System.out.println("Removed " + currentChild);
            }

            currentTosses++;
        }
        System.out.println("Last is " + queue.poll());
    }

    static String readChildNames(Scanner scanner) {
        return scanner.nextLine();
    }

    static int readTossesNumber(Scanner scanner) {
        return scanner.nextInt();
    }
}

/*
//100
 String childNames = readChildNames(scanner);
        String[] splitChildren = childNames.split("\\s+");
        int tossesToRemoveOn = readN(scanner);

        Deque<String> queue = new ArrayDeque<>(Arrays.asList(splitChildren));
        int currenRound = 1;
        while (queue.size() > 1) {
            String currentChild = queue.poll();
            if(currenRound % tossesToRemoveOn != 0){
                queue.offer(currentChild);
            }else {
                System.out.println("Removed " + currentChild);
            }
            currenRound++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static int readN(Scanner scanner) {
        return scanner.nextInt();
    }

    private static String readChildNames(Scanner scanner) {
        return scanner.nextLine();
    }
 */
//100
/*
Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        Deque<String> deque = new ArrayDeque<>(Arrays.asList(arr));

        int nthChild = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        while (deque.size() > 1){

                if(counter % nthChild == 0) {
                    String removed = deque.poll();
                    System.out.println(String.format("Removed %s", removed));
                }else {
                    String first = deque.poll();
                    deque.offer(first);
                }
                counter++;
        }
        System.out.println(String.format("Last is %s", deque.poll()));
    }
 */
