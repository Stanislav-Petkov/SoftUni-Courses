import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = {13,2,34,73,24,86};
        Arrays.sort(arr);
        System.out.println(findIndexOf(arr, 73));
    }

    private static int findIndexOf(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int curr = arr[mid];
            if (key < curr) {
                end = mid - 1;
            } else if (key > curr) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
