package JAVA.JAVA_PROGRAMS;

public class P_03_Leap_Year {

    // Todo:- Check Whether A Year Leap Year Or Not.
    public static boolean isLeapYear(int year) {
        
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2023));
    }
}
