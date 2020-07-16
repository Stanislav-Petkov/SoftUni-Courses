import java.util.Scanner;

public class VariationsWIthRepetitions {
    private static String[] elements;
    private static String[] variations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        variations = new String[k];
        variations(0);
    }

    private static void variations(int index) {
        if (index == variations.length) {
            System.out.println(String.join(" ", variations));
            return;
        } else {
            for (int i = 0; i < elements.length; i++) {
                variations[index] = elements[i];
                variations(index + 1);
            }
        }
    }
}
/*
import java.util.Scanner;

public class VariationsWIthRepetitions {
    private static String[] elements;
    private static String[] variations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        int k = Integer.parseInt(scanner.nextLine());
        variations = new String[k];
        variations(0);
    }
    private static void variations(int index){
        if(index == variations.length){
            System.out.println(String.join(" ", variations));
            return;
        }else {
            for (int i = 0; i < elements.length; i++) {
                variations[index] = elements[i];
                variations(index + 1);
            }
        }
    }
}

 */
