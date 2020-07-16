import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = bufferedReader.readLine().split("\\s+");

        //printReverseNumbers(nums, nums.length - 1);
        printReversedArray(nums, nums.length - 1);
    }

    private static void printReversedArray(String[] nums, int index) {
        if(index < 0){
            return;
        }
        System.out.print(nums[index] + " ");
        printReverseNumbers(nums, index - 1);
    }

    private static void printReverseNumbers(String[] nums, int index) {
        if(index == 0){
            System.out.print(nums[0] + " ");
            return;
        }
        System.out.print(nums[index] + " ");
        printReverseNumbers(nums , index - 1);
    }
}
