import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets04lab {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String input = readInput(scanner);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                stack.push(i);
            }
            if (ch == ')') {
                int openBracketIndex = stack.pop();
                System.out.println(input.substring(openBracketIndex, i + 1));
            }
        }
    }

    private static String readInput(Scanner scanner) {
        return scanner.nextLine();
    }
}

/*
public class MatchingBrackets04lab {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String input = readInput(scanner);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                stack.push(i);
            }
            if (ch == ')') {
                int openBracketIndex = stack.pop();
                System.out.println(input.substring(openBracketIndex, i + 1));
            }
        }
    }
    private static String readInput(Scanner scanner) {
        return scanner.nextLine();
    }
}

 */
/*
//100
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets04lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();
        Deque<Integer> stack = new ArrayDeque<>();
        int firstBracketIndex = -1;
        int secondBracketIndex = -1;
        //int i = 0;
        for (int i = 0; i < input.length(); i++) {

            char ch = arr[i];
            if(input.charAt(i) == '('){
                //firstBracketIndex = i;
                stack.push(i);
            }
            if(input.charAt(i) == ')'){
                secondBracketIndex = i;
                firstBracketIndex = stack.pop();
            }
            if(firstBracketIndex != -1 && secondBracketIndex != -1){
                String substring = input.substring(firstBracketIndex, secondBracketIndex + 1);
                System.out.println(substring);
                firstBracketIndex = -1;
                secondBracketIndex = -1;
            }

            //i++;
        }

    }
}

 */