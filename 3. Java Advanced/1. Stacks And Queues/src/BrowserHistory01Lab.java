import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = "";
        Deque<String> history = new ArrayDeque<>();
        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "back":
                    if (history.size() <= 1) {
                        output = "no previous URLs";
                    } else {
                        history.pop();
                        output = history.peek();
                    }
                    break;
                case "Home":
                    return;
                default:
                    history.push(input);
                    output = history.peek();
            }
            System.out.println(output);
        }
    }
}

/*
Deque<String> history = new ArrayDeque<>();

        String output = "";
        while (true) {
            String line = scanner.nextLine();
            switch (line) {
                case "back":
                    if (history.size() <= 1) {
                        output = "no previous URLs";
                    } else {
                        history.pop();
                        output = history.peek();
                    }
                    break;
                case "Home":
                    return;
                default:
                    output = line;
                    history.push(line);
            }
            System.out.println(output);
        }
 */