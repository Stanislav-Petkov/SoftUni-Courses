package p04_BubbleSortTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleTest {
    @Test
    public void testSort() {
        int arr[] = {6, 3, -1, 9, 2};
        int[] expected = {-1, 2, 3, 6, 9};
        Bubble.sort(arr);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], arr[i]);
        }
    }
}
