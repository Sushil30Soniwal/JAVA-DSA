package DSA.DSA_SHEET.EASY;

import java.util.Arrays;

public class Q_01_Reverse_Array {

    /**
     * Todo :- Reverse A Given Array.
     * ! Time Complexity :- O(N).
     * ? Space Complexity :- O(1).
     */
    public static void reverse(int[] arr) {
        int n = arr.length;
        int s = 0, e = n - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 7 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
