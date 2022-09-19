package datetimehandle.homework;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeNewYorkE5 {
    public static void main(String[] args) {
        ZonedDateTime timeNY = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(timeNY);
    }
}
