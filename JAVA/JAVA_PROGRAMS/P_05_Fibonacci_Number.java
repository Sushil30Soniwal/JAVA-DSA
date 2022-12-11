package JAVA.JAVA_PROGRAMS;

public class P_05_Fibonacci_Number {

    // Todo :- Print The N'th Fibonacci Number.
    public static int fibNum(int n) {
        int first = 0, second = 1, next;
        for (int i = 1; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(fibNum(5));
    }
}
