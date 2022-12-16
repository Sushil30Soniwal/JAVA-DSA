package DSA.DSA_TOPICS.ARRAY.ARRAY_1D;

import java.util.Arrays;

/**
 * ? Selection_Sort:- Take Minimum Element From Unsorted Array & Place It At The
 * Beginning Of The Unsorted Array.
 * * Not A Stable Sorting Algorithm.
 * ? Time Complexity:- O(n^2) In Both Best & Worst Case.
 * ! Space Complexity :- O(1).
 */

public class Ch_06_Selection_Sort {

    // Todo:- Method To Implement Selection Sort.
    public static void sort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            // Put Minimum At The Correct Position.
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 4, 11, 2 };
        int size = arr.length;
        sort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
}
