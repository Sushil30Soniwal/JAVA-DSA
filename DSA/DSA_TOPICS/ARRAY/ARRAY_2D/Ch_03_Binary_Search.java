package DSA.DSA_TOPICS.ARRAY.ARRAY_2D;

public class Ch_03_Binary_Search {

    /**
     * Todo:- Binary Search In A Row & Col Wise Sorted Matrix.
     * ? Time Complexity :- O(M + N).
     * ! Space Complexity :- O(1).
     */
    public static boolean searchMatrix_row_col(int[][] mat, int target) {
        int m = mat.length; // Number Of Rows.
        int n = mat[0].length; // Number Of Columns.
        int row_idx = 0, col_idx = n - 1;

        while (row_idx < m && col_idx >= 0) {
            int num = mat[row_idx][col_idx];

            if (num == target) {
                return true;
            } else if (num > target) {
                col_idx--;
            } else {
                row_idx++;
            }
        }
        return false;
    }
    // *-------------------------------------------------------------------------------

    /**
     * Todo:- Binary Search In A Completely Sorted Matrix.
     * ? Time Complexity :- O(log(M*N)).
     * ! Space Complexity :- O(1).
     */
    public static boolean searchMatrix_sorted(int[][] mat, int target) {
        int m = mat.length; // Number Of Rows.
        int n = mat[0].length; // Number Of Columns.

        // Taking two imaginary indexes.
        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // [mid/col_num][mid%col_num] = Actual Index.

            int num = mat[mid / n][mid % n];

            if (num == target) {
                return true;
            } else if (num > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Row & Column Wise Sorted Matrix.
        int[][] mat1 = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 } };
        System.out.println(searchMatrix_row_col(mat1, 12));

        // Completely Sorted Matrix.
        int[][] mat2 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix_sorted(mat2, 50));
    }
}
