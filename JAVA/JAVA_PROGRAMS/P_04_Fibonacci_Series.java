package JAVA.JAVA_PROGRAMS;

public class P_04_Fibonacci_Series {

    // Todo:- Fibonacci Series Till N'th Term.
    public static void fibSeq(int n) {
        int first = 0, second = 1, next;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first;
            first = second;
            second += next;
        }
    }

    public static void main(String[] args) {
        fibSeq(8);
    }
}