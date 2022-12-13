package DSA.DSA_TOPICS.ARRAY.ARRAY_1D;

import java.util.Arrays;

public class Ch_02_Array_Methods {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 8, 1, 2, 4 };

        // Length Of The Array.
        int length = arr.length;
        System.out.println("The Length Of The Array Is:- " + length);

        // Sort An Array.
        Arrays.sort(arr);

        // Print Array.
        System.out.println(Arrays.toString(arr));

        // Copy An Array With New Length.
        int[] copy = Arrays.copyOf(arr, 8);
        System.out.println(Arrays.toString(copy));

        // Copy An Array Till Given Window.
        int[] nums = Arrays.copyOfRange(arr, 0, 4);
        System.out.println(Arrays.toString(nums));
    }
}
