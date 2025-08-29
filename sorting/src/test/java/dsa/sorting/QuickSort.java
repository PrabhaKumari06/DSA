package dsa.sorting;

public class QuickSort {
    public void sort(int[] arr, int start, int end) {
        if (start > end) return;
        int pIndex = partition(arr, start, end);
        sort(arr, start, pIndex - 1);
        sort(arr, pIndex + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pIndex = start;
        int pivot = arr[end];
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        arr[end] = arr[pIndex];
        arr[pIndex] = pivot;
        return pIndex;
    }

}
