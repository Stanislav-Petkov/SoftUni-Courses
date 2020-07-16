public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a = {3, 12, 19, 46};
        int[] b = {4, 14, 21, 23};
        int[] c = new int[a.length + b.length];
        int k = 0;
        int v = 0;
        int i;
        for (i = 0; i < 7; i++) {
            if (a[k] < b[v]) {
                c[i] = a[k];
                k++;
            } else {
                c[i] = b[v];
                v++;
            }
        }
        while (k < a.length) {
            c[i] = a[k];
            k++;
        }
        while (v < b.length) {
            c[i] = b[v];
            v++;
        }

    }
}
