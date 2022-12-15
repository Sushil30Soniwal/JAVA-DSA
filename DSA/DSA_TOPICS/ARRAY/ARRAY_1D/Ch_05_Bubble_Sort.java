package DSA.DSA_TOPICS.ARRAY.ARRAY_1D;

import java.util.Arrays;

/**
 * ? Bubble_Sort:- Swap two adjacent elements if they are in wrong order.
 * * Stable Sorting Algorithm.
 * ? Time Complexity:- O(n^2) In Worst Case & O(n) In Best case.
 * ! Space Complexity :- O(1).
 */

public class Ch_05_Bubble_Sort {

    // Todo:- Method To Implement Bubble Sort.
    public static void sort(int[] arr, int size) {

        // Outer loop for no. of passes.
        for (int pass = 0; pass < size - 1; pass++) {
            boolean isSwapped = false;

            // Inner loop for comparison & swapping.
            for (int idx = 0; idx < size - pass - 1; idx++) {
                if (arr[idx] > arr[idx + 1]) {
                    int temp = arr[idx];
                    arr[idx] = arr[idx + 1];
                    arr[idx + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break; // Now the array is sorted.
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 11, 4, 2 };
        int size = arr.length;
        sort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
}
