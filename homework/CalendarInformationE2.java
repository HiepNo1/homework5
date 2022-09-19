package datetimehandle.homework;

import java.time.LocalDateTime;

public class CalendarInformationE2 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2001, 06, 11, 4, 50, 10);
        System.out.println(time.getYear());
        System.out.println(time.getMonth());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
    }
}
