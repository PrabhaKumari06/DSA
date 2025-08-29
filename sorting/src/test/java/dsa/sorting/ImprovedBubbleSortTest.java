package dsa.sorting;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ImprovedBubbleSortTest {

    @Test
    public void testSort() {
        int[] input = {6, 1, 4, 2, 11, 9};
        int[] expected = {1, 2, 4, 6, 9, 11};
        ImprovedBubbleSort bubbleSort = new ImprovedBubbleSort();
        assertArrayEquals(expected, bubbleSort.sort(input));
    }
}