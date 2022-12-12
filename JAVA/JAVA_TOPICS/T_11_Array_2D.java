package JAVA.JAVA_TOPICS;

import java.util.Scanner;

public class T_11_Array_2D {

    /* 2 Ways To Declare & Initialise A 2D Array In Java */

    // 1st Way.
    public static void method1() {
        int[][] mat = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        System.out.println(mat[0][0]); // 10
        System.out.println(mat[1][1]); // 50
        System.out.println(mat[2][2]); // 90
    }

    // 2nd Way.
    public static void method2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter The Number Of Rows For Your Matrix :- ");
        int row_size = in.nextInt();
        System.out.print("Enter The Number Of Columns For Your Matrix :- ");
        int col_size = in.nextInt();

        int[][] mat = new int[row_size][col_size];

        // Input The Matrix.
        System.out.println("Enter elements of your matrix:- ");
        for (int row = 0; row < row_size; row++) {
            for (int col = 0; col < col_size; col++) {
                mat[row][col] = in.nextInt();
            }
        }

        // Print The Matrix.
        System.out.println("Your matrix is:- ");
        for (int row = 0; row < row_size; row++) {
            for (int col = 0; col < col_size; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }

        in.close();
    }

    public static void main(String[] args) {
        // method1();
        method2();
    }
}
