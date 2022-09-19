package datetimehandle.homework;

import java.util.Scanner;

public class LeapYear18 {
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm : ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " ko là năm nhuận");
        }
    }
}
