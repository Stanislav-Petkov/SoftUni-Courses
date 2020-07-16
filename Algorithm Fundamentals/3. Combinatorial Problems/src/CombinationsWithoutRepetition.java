import javax.swing.*;
import java.util.Scanner;

public class CombinationsWithoutRepetition {
    private static String[] elements;
    private static String[] combinations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        combinations = new String[k];
        combinations(0,0);
    }
    private static void combinations(int index, int start){
        if(index >= combinations.length){
            System.out.println(String.join(" ", combinations));
        }else {
            for (int i = start; i < elements.length; i++) {
                combinations[index] = elements[i];
                combinations(index + 1, i + 1);
            }
        }
    }

}



/*
import javax.swing.*;
import java.util.Scanner;

public class CombinationsWithoutRepetition {
    private static String[] elements;
    private static String[] combinations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        combinations = new String[k];
        combinations(0,0);
    }

    private static void combinations(int index, int start) {
        if(index == combinations.length){
            System.out.println(String.join(" ",combinations));
        }else{
            for (int i = start; i < elements.length; i++) {
                combinations[index] = elements[i];
                combinations(index + 1, i + 1 );
            }
        }
    }
}


 */