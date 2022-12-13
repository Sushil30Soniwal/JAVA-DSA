package JAVA.JAVA_PROGRAMS;

public class P_08_Palindrome_Number {

    // Todo :- Check Whether A Given Number Is Palindrome Or Not.
    public static boolean isPalindrome(int num) {
        int original_num = num;
        int reverse_num = reverse(num);
        boolean isPdm = (original_num == reverse_num) ? true : false;
        return isPdm;
    }

    // * Method To Reverse A Given Number.
    private static int reverse(int num) {
        int rev_num = 0;
        while (num != 0) {
            int rem = num % 10;
            rev_num = rev_num * 10 + rem;
            num = num / 10;
        }
        return rev_num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
