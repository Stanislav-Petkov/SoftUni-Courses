import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParantheses06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean areBalanced = true;
        String lookTable = "([{";
        for (int i = 0; i < inputLine.length(); i++) {
            char symbol = inputLine.charAt(i);
            if (lookTable.contains(symbol + "")) {
                stack.push(symbol);
            } else {
                if (stack.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char top = stack.pop();
                if (!(top == '(' && symbol == ')' ||
                        top == '[' && symbol == ']' ||
                        top == '{' && symbol == '}')) {
                    areBalanced = false;
                    break;
                }
            }
        }
        String output = areBalanced ? "YES" : "NO";
        System.out.println(output);
    }
}

/*
import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParantheses06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String lookupTable = "([{";
        boolean areBalanced = true;
        for (int i = 0; i < inputLine.length(); i++) {
            char symbol = inputLine.charAt(i);
            if (lookupTable.contains(symbol + "")) {
                stack.push(symbol);
            } else {
                if (stack.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char top = stack.pop();
                if (!(top == '(' && symbol == ')'
                        || top == '[' && symbol == ']'
                        || top == '{' && symbol == '}')) {
                    areBalanced = false;
                    break;
                }
            }

        }
        String output = areBalanced ? "YES" : "NO";
        System.out.println(output);
    }
}

 */
/*
//62
import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParantheses06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        if(inputLine.length() == 0){
            System.out.println("NO");
            return;
        }
        String[] arr = inputLine.split("");
        ArrayDeque<String> brackets = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            String arrayBracket = arr[i];
            if(arrayBracket.equals("{")){
                brackets.push(arrayBracket);
                if(arr[i+1].equals(")") || arr[i+1].equals("]")){
                    System.out.println("NO");
                    return;
                }else if(arr[i+1].equals("}")){
                    brackets.pop();
                }
            }else if(arrayBracket.equals("[")){
                brackets.push(arrayBracket);
                if(arr[i+1].equals(")") || arr[i+1].equals("}")){
                    System.out.println("NO");
                    return;
                }else if(arr[i+1].equals("]")){
                    brackets.pop();
                }
            }else if(arrayBracket.equals("(")){
                brackets.push(arrayBracket);
                if(arr[i+1].equals("}") || arr[i+1].equals("]")) {
                    System.out.println("NO");
                    return;
                }
//                }else if(arr[i+1].equals(")")){
//                    brackets.pop();
//                }
            }
            if(arrayBracket.equals(")")){
                if(brackets.peek().equals("(")){
                    brackets.pop();
                }else {
                    System.out.println("NO");
                    return;
                }
            }
            if(arrayBracket.equals("]")){
                if(brackets.peek().equals("[")){
                    brackets.pop();
                }else {
                    System.out.println("NO");
                    return;
                }
            }
            if(arrayBracket.equals("}")){
                if(brackets.peek().equals("{")){
                    brackets.pop();
                }else {
                    System.out.println("NO");
                    return;
                }
            }

            if(brackets.isEmpty()){
                System.out.println("YES");
                return;
            }
        }
        if(brackets.isEmpty()){
            System.out.println("YES");
            return;
        }
    }
}

 */