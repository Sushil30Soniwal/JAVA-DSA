package JAVA.JAVA_PROGRAMS;

public class P_07_Reverse_Number {

    // Todo :- Reverse A Number => O(N).
    public static int reverse(int num) {
        int rev_num = 0;
        while (num != 0) {
            int rem = num % 10;
            rev_num = rev_num * 10 + rem;
            num /= 10;
        }
        return rev_num;
    }

    public static void main(String[] args) {
        System.out.println(reverse(105));
    }
}
