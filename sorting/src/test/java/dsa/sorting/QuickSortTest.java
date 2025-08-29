package dsa.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testSort() {
        int[] input = {6, 1, 4, 2, 11, 9};
        int[] expected = {1, 2, 4, 6, 9, 11};
        QuickSort sort = new QuickSort();
        sort.sort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
}