package datetimehandle.homework;

import java.time.LocalDateTime;

public class Day22 {
    public static LocalDateTime addDay (LocalDateTime time, int numberAdd) {
        return time.plusDays(numberAdd);
    }

    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println("Thời gian sau 10 ngày là : " + addDay(timeNow, 10));
        System.out.println("Thời gian trước 10 ngày là : " + addDay(timeNow, -10));
    }
}
