package JAVA.JAVA_PROGRAMS;

public class P_06_Factorial {

    // Todo :- Calculate Factorial Of A Given Number.
    public static int facto(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n;
            n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(facto(5));
    }
}
