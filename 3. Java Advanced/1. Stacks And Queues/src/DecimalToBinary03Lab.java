import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinary03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        if (decimal == 0) {
            System.out.println(0);
            return;
        }
        Deque<Integer> stack = new ArrayDeque<>();

        int reminder = 0;
        while (decimal != 0) {
            reminder = decimal % 2;
            stack.push(reminder);
            decimal = decimal / 2;
        }
        int size = stack.size();
        for (int s = 0; s < size; s++) {
            System.out.print(stack.pop() + "");
        }
    }
}

/*
ort java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinary03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        if(decimal == 0){
            System.out.println(0);
            return;
        }
        Deque<Integer>stack = new ArrayDeque<>();

        int reminder = 0;
        while (decimal != 0){
            reminder = decimal % 2 ;
            stack.push(reminder);
            decimal = decimal / 2;
        }
       int size = stack.size();
        for (int s = 0; s < size; s++) {
            System.out.print(stack.pop() +"");
        }
    }
}
 */
/*
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinary03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        if(decimal == 0){
            System.out.println(0);
            return;
        }
        Deque<Integer>stack = new ArrayDeque<>();

        int reminder = 0;
        while (decimal != 0){
            reminder = decimal % 2 ;
            stack.push(reminder);
            decimal = decimal / 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() +"");
        }
    }
}
 */