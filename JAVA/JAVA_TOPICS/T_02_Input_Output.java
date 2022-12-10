package JAVA.JAVA_TOPICS;

import java.util.Scanner;

public class T_02_Input_Output {

    public static void main(String[] args) {

        // Input In Java.
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // Output In Java.
        System.out.println("Your Name Is :- " + name);
        sc.close();
    }
}
