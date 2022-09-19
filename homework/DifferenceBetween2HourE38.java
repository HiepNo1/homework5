package datetimehandle.homework;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DifferenceBetween2HourE38 {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(7, 30);
        LocalTime endTime = LocalTime.of(10, 17);
        long differentMinute = Duration.between(startTime, endTime).toMinutes();
        double differentHour = differentMinute / 60;
        System.out.println("Sự chênh lệch giữa 2 giờ là " + differentMinute + " giây , ứng với  " + differentHour + " giờ");

    }
}
