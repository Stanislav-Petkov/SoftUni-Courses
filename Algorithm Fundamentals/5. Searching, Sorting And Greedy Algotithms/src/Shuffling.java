import java.util.Arrays;
import java.util.Random;

public class Shuffling {
    public static void main(String[] args) {
        int[] arr = {13,15,12,24,59};

        Arrays.sort(arr);

        shuffle(arr);
        
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    private static void shuffle(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            swap(arr, i , random.nextInt(arr.length));
        }
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
