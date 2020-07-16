import java.util.Scanner;

public class PermutationWIthSwap {
    public static String[] elements;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        permutation(0);
    }
    public static void permutation(int index){
        if(index == elements.length){
            System.out.println(String.join(" ",elements));
            return;
        }
        permutation(index + 1);
        System.out.println();
        for (int i = index + 1; i < elements.length; i++) {
            swap(elements,index,i);
            permutation(index + 1);
            swap(elements,index,i);
        }
    }

    private static void swap(String[] elements, int first, int second) {
        String temp = elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
    }
}


/*
import java.util.Scanner;

public class PermutationWIthSwap {
    public static String[] elements;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        permutation(0);
    }

    public static void permutation(int index) {
        if (index == elements.length) {
            print();
            return;
        }
        permutation(index + 1);
        for (int i = index + 1; i < elements.length; i++) {
            swap(elements, index, i);
            permutation(index + 1);
            // Swap again when backtracking
            swap(elements, index, i);
        }
    }

    public static void swap(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void print() {
        System.out.println(String.join(" ", elements));
    }
}

 */