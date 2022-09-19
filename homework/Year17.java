package datetimehandle.homework;

import java.time.LocalDateTime;

public class Year17 {
    public static LocalDateTime addYear (LocalDateTime time, int numberAdd) {
        return time.plusYears(numberAdd);
    }

    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println("Thời gian sau 1 năm là : " + addYear(timeNow, 1));
        System.out.println("Thời gian trước 1 năm là : " + addYear(timeNow,-1));
    }
}
