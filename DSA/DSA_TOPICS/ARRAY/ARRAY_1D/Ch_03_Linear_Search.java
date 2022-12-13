package DSA.DSA_TOPICS.ARRAY.ARRAY_1D;

/**
 * ? Linear Search :- Compare Every Element With Target Element.
 * ! Time Complexity :- O(N).
 * ? Space Complexity :- O(1).
 */

public class Ch_03_Linear_Search {

    // Todo:- Method To Implement Linear Search.
    public static int search(int[] arr, int target) {
        int len = arr.length;

        for (int idx = 0; idx < len; idx++) {
            if (arr[idx] == target) {
                return idx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 6, 3, 0 };
        int target = 3;

        int ans = search(arr, target);

        if (ans == -1) {
            System.out.println("Target Element Isn't Present In The Array");
        } else {
            System.out.println("Target Element Present At The Index :- " + ans);
        }
    }
}