import java.util.Arrays;

public class permuteSwap {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 5, 5};
        Arrays.sort(arr);
        permuteRep(arr, 0, arr.length - 1);

    }

    private static void permuteRep(int[] arr, int start, int end) {
        printPermutations(arr);
        for (int left = end - 1; left >= start; left--) {
            for (int right = left + 1; right <= end; right++) {
                if (arr[left] != arr[right]) {
                    swapElements(arr, left, right);
                    permuteRep(arr, left + 1, end);
                }
            }
            int firstElement = arr[left];
            for (int i = left; i <= end - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[end] = firstElement;
        }

    }

    private static void swapElements(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private static void printPermutations(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
