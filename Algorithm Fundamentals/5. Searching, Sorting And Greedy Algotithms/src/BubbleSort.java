public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    swap(arr, i , j);
                }
            }
        }
    }
    public static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
