import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.stream.Collectors;

public class TowerOfHanoi {
    private static StringBuilder out = new StringBuilder();

    private static Deque<Integer> source = new ArrayDeque<>();
    private static Deque<Integer> spare = new ArrayDeque<>();
    private static Deque<Integer> destination = new ArrayDeque<>();

    private static int steps = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int disk = Integer.parseInt(reader.readLine());

        for (int i = disk; i >= 1 ; i--) {
            source.push(i);
        }

        printRods();
        solve(disk, source, destination,spare);
        System.out.println(out.toString());
    }

    private static void solve(int disk, Deque<Integer> source, Deque<Integer> destination, Deque<Integer> spare) {
        if(disk == 1){
            // We are on the first added disk and it can be moved
            destination.push(source.pop());
            out.append("Step #")
                    .append(steps++)
                    .append(": Moved disk")
                    .append(System.lineSeparator());
            printRods();
        }else {
            // Moves disk from source to spare when reaches the bottom
            solve(disk - 1, source, spare, destination);
            // Returning from the recursion move from source to destination
            solve(1, source,destination, spare);
            // Move from spare to destination
            solve(disk - 1, spare, destination, source);
        }
    }
    public static void printRods(){
        out.append(String.format("Source: %s%nDestination: %s%nSpare: %s%n",
                formatRod(source), formatRod(destination), formatRod(spare)))
                .append(System.lineSeparator());
    }

    private static String formatRod(Deque<Integer> stack) {
        return stack.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf) // Integers become Strings
                .collect(Collectors.joining(", "));
    }
}



















