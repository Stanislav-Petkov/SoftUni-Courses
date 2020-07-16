import java.util.HashSet;
import java.util.Scanner;

public class PermutationWithRepetition {
    public static String[] elements ;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        permuteWithRepetitions(0);
    }

   public static void permuteWithRepetitions(int index){
        if(index >= elements.length){
            System.out.println(String.join(" ",elements));
            return;
        }else {
            permuteWithRepetitions(index + 1);
            // Tha hashset contains elements, which were in the swap method
            HashSet<String> swapped = new HashSet<>();
            // mark the element as added so that iI can get only unused elements
            swapped.add(elements[index]);
            for (int i = index + 1; i < elements.length; i++) {
                if(!swapped.contains(elements[i])) {
                    // The swap is called for an element, which has not been already swapped
                    swap(index, i);
                    permuteWithRepetitions(index + 1);
                    swap(index, i);
                    swapped.add(elements[i]);
                }
            }
        }
   }

   public static void swap(int first, int second){
        String temp = elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
   }
}




/*
import java.util.HashSet;
import java.util.Scanner;

public class PermutationWithRepetition {
    public static String[] elements ;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        permuteWithRepetitions(0);
    }

    private static void permuteWithRepetitions(int index) {
        if(index >= elements.length){
            System.out.println(String.join(" ",elements));
        }else {
            permuteWithRepetitions(index + 1);
            HashSet<String> swapped = new HashSet<>();
            swapped.add(elements[index]);
            for (int i = index + 1; i < elements.length; i++) {
                if(!swapped.contains(elements[i])){
                    swap(index, i);
                    permuteWithRepetitions(index + 1);
                    swap(index, i);
                    swapped.add(elements[i]);
                }
            }
        }
    }

    private static void swap(int first, int second) {
        String temp = elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
    }
}












 */





