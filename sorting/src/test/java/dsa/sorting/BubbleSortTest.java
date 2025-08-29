package dsa.sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void sort() {
        int[] input = {6, 1, 4, 2, 11, 9};
        int[] expected = {1, 2, 4, 6, 9, 11};
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(expected,bubbleSort.sort(input));
    }
}