import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
//        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt)
//                .toArray();

        sort(arr);
        StringBuilder builder = new StringBuilder();
        for(int num : arr){
            builder.append(num).append(" ");
        }
        System.out.println(builder.toString());
    }

    private static void sort(int[] arr) {
        // from where it starts and where it ends
        mergeSort(arr, 0, arr.length - 1 );
    }

    private static void mergeSort(int[] arr, int begin, int end) {
        if(begin >= end){
            // The bottom of recursion is when there is 1 element left
            return;
        }

        int mid = (begin + end) / 2;

        mergeSort(arr, begin, mid);
        mergeSort(arr, mid + 1, end);

        // Rearranging the values
        merge(arr, begin, mid, end);
    }

    private static void merge(int[] arr, int begin, int mid, int end) {
        // If the right most elements of the left part is lower than the left most element of the right part
        // return without merging
        if(mid < 0 || mid >= arr.length || arr[mid] < arr[mid + 1]){
            return;
        }

        // The left part starts from begin
        int left = begin;
        int right = mid + 1;

        // Buffer helper array
        int[] helper = new int[arr.length];

        for (int i = begin; i <=end ; i++) {
            helper[i] = arr[i];
        }

        for (int i = begin; i <= end ; i++) {
            if(left > mid){
                // getting from the right, because left is pointing after the middle where there are no left side elements
                arr[i] = helper[right++];
            }else if(right > end){
                // getting from the left
                arr[i] = helper[left++];
            }else if(helper[left] < helper[right]){
                // Get the lower value from the left side
                // left++ so that the pointer points to the new element in the left part
                arr[i] = helper[left++];
            } else {
                arr[i] = helper[right++];
            }
        }
    }
}












