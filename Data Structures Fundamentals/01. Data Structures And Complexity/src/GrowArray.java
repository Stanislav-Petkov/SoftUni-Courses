public class GrowArray {

    static int[] elements = new int[4];

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == elements.length) {
                elements = grow();
            }
            elements[i] = 10 + i;
        }
    }

    private static int[] grow() {
        int[] arr = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
        }
        return arr;
    }
}
