package datetimehandle.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Week16 {
    public static LocalDateTime addWeek (LocalDateTime time, int numberAdd) {
        return time.plusWeeks(numberAdd);
    }

    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println("Thời gian sau 2 tuần là : " + addWeek(timeNow, 2));
    }
}
