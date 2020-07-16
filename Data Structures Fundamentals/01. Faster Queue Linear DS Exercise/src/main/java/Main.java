import implementations.BalancedParentheses;
import implementations.DoublyLinkedList;
import implementations.Queue;

public class Main {
    public static void main(String[] args) {
        String input = "{ [()]} }";
        BalancedParentheses string = new BalancedParentheses(input);
        System.out.println(string.solve());
    }
}
