package datetimehandle.homework;

import java.time.LocalDate;

public class FirstAndLastDay9_10 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        LocalDate firstDay = timeNow.withDayOfMonth(1);
        LocalDate lastDay = timeNow.withDayOfMonth(timeNow.lengthOfMonth());
        System.out.println("Ngày đầu tiên của tháng là : " + firstDay + " - " + firstDay.getDayOfWeek());
        System.out.println("Ngày cuối cùng của tháng là : " + lastDay + " - " + lastDay.getDayOfWeek());
    }
}
