package JAVA.JAVA_PROGRAMS;

import java.util.Scanner;

public class P_01_Even_Odd {

    // Todo :- Check Whether A Given Number Is Even Or Odd.
    public static void checkNum(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " Is An Even Number");
        } else {
            System.out.println(num + " Is An Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number :- ");
        int num = in.nextInt();

        checkNum(num);
        in.close();
    }
}
