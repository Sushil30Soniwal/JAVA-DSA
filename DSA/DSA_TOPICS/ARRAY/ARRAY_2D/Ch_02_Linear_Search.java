package DSA.DSA_TOPICS.ARRAY.ARRAY_2D;

import java.util.Arrays;

/**
 * ? Linear Search :- Compare Every Element With Target Element.
 * ! Time Complexity :- O(M*N).
 * ? Space Complexity :- O(1).
 */

public class Ch_02_Linear_Search {

    // Todo:- Method To Implement Linear Search.
    public static int[] search(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (mat[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] mat = { { 10, 50, 30 }, { 20, 40, 60 }, { 70, 80, 90 } };
        int[] ans = search(mat, 60);
        System.out.println(Arrays.toString(ans));
    }
}
