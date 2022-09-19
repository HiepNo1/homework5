package datetimehandle.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;

public class FinalDayE7 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        LocalDate lastDate = timeNow.withDayOfMonth(timeNow.lengthOfMonth());
        System.out.println("Ngày cuối cùng của tháng hiện tại là : " + lastDate);
    }
}
