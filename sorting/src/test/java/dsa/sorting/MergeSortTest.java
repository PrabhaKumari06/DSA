package dsa.sorting;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest  {

    @Test()
    public void testSort() {
        int[] input = {6, 1, 4, 2, 11, 9};
        int[] expected = {1, 2, 4, 6, 9, 11};
        MergeSort sort = new MergeSort();
        sort.sort(input);
        assertArrayEquals(expected,input);
    }
}