public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 92, 34, 40};
        System.out.println(indexOf(arr, 92));
    }

    private static int indexOf(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
