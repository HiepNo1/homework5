package datetimehandle.homework;

import java.time.LocalDate;

public class Year25 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        int year = timeNow.getYear();
        System.out.println("Năm hiện tại : " + year);
        if (LeapYear18.isLeapYear(year)) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + " ko là năm nhuận");
        }
        System.out.println("Năm " + year + " có " + timeNow.lengthOfYear() + " ngày");
    }
}
