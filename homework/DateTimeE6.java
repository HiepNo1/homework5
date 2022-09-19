package datetimehandle.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeE6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Ngày hiện tại : " + date);
        System.out.println("Giờ hiện tại : " + time);
    }
}
