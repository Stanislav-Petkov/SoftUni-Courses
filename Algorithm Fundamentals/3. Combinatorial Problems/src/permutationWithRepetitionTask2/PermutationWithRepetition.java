package permutationWithRepetitionTask2;

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










