package datetimehandle.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Hour15 {
    public static LocalDateTime addHour (LocalDateTime time, int numberAdd) {
        return time.plusHours(numberAdd);
    }

    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println("Thời gian sau 10 giờ là : " + addHour(timeNow, 10));
    }
}
