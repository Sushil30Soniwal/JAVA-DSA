package DSA.DSA_TOPICS.ARRAY.ARRAY_1D;

/**
 * ? Binary Search :- Divide Search Interval In Half(Sorted Array).
 * ! Time Complexity :- O(logN).
 * ? Space Complexity :- O(1).
 */

public class Ch_04_Binary_Search {

    // * Binary Search For Increasing Order Sorted Array.
    public static int searchINC(int[] arr, int target) {
        int len = arr.length;
        int start_idx = 0, end_idx = len - 1;

        while (start_idx <= end_idx) {
            int mid_idx = start_idx + (end_idx - start_idx) / 2;

            if (arr[mid_idx] == target) {
                return mid_idx;
            }

            else if (arr[mid_idx] > target) {
                end_idx = mid_idx - 1;
            }

            else {
                start_idx = mid_idx + 1;
            }
        }
        return -1;
    }
    // *-----------------------------------------------------------

    // * Binary Search For Decreasing Order Sorted Array.
    public static int searchDEC(int[] arr, int target) {
        int len = arr.length;
        int start_idx = 0, end_idx = len - 1;
        while (start_idx <= end_idx) {
            int mid_idx = start_idx + (end_idx - start_idx) / 2;

            if (arr[mid_idx] == target) {
                return mid_idx;
            }

            else if (arr[mid_idx] > target) {
                start_idx = mid_idx + 1;
            }

            else {
                end_idx = mid_idx - 1;
            }
        }
        return -1;
    }
    // *-----------------------------------------------------------

    // * Binary Search For Unknown Order Sorted Array.
    public static int searchOA(int[] arr, int target) {
        int size = arr.length;
        int start_idx = 0, end_idx = size - 1;
        while (start_idx <= end_idx) {
            int mid_idx = start_idx + (end_idx - start_idx) / 2;

            if (arr[mid_idx] == target) {
                return mid_idx;
            }

            // * If Array Is Sorted In Ascending Order.
            else if (arr[start_idx] < arr[end_idx]) {
                if (arr[mid_idx] > target) {
                    end_idx = mid_idx - 1;
                } else {
                    start_idx = mid_idx + 1;
                }
            }

            // * If Array Is Sorted In Descending Order.
            else {
                if (arr[mid_idx] > target) {
                    start_idx = mid_idx + 1;
                } else {
                    end_idx = mid_idx - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 6, 8, 9, 12, 14 };
        System.out.println(searchINC(arr1, 12));

        int[] arr2 = { 14, 12, 9, 8, 6, 3 };
        System.out.println(searchDEC(arr2, 12));

        System.out.println(searchOA(arr2, 12));
    }
}
