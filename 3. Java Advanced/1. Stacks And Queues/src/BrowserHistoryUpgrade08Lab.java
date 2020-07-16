import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistoryUpgrade08Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = "";
        Deque<String> historyStack = new ArrayDeque<>();
        Deque<String> forwardQueue = new ArrayDeque<>();
        String last = "";
        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "back":
                    if (historyStack.size() <= 1) {
                        output = "no previous URLs";
                    } else {
                        forwardQueue.offer(historyStack.pop());
                        output = historyStack.peek();
                        if (!last.equals("")) {
                            output = last;
                        }
                    }
                    break;
                case "forward":
                    if (forwardQueue.isEmpty()) {
                        output = "no next URLs";
                    } else {
                        output = forwardQueue.peek();
                        last = output;
                        forwardQueue.clear();
                    }
                    break;
                case "Home":
                    return;
                default:
                    historyStack.push(input);
                    output = historyStack.peek();
            }

            System.out.println(output);
        }
    }
}