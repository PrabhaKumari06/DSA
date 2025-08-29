package dsa.sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest  {

    @Test
    public void sort(){
        int[] input = {6, 1, 4, 2, 11, 9};
        int[] expected = {1, 2, 4, 6, 9, 11};
        SelectionSort sort = new SelectionSort();
        assertArrayEquals(expected,sort.sort(input));

    }

}