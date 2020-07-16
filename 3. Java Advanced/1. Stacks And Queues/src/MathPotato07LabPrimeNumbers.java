import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MathPotato07LabPrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String childNames = readChildNames(scanner);
        String[] splitChildren = childNames.split("\\s+");
        int tossesToRemoveOn = readTossesNumber(scanner);
        Deque<String> queue = new ArrayDeque<>(Arrays.asList(splitChildren));

        int currentTosses = 1;
        while (queue.size() > 1) {
            if (isPrime(currentTosses)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
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


    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
