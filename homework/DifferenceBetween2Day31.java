package datetimehandle.homework;

import java.time.Duration;
import java.time.LocalDateTime;

public class DifferenceBetween2Day31 {
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.of(2021, 12, 12, 12, 12, 12);
        LocalDateTime endDate = LocalDateTime.now();
        long differentSecond = Duration.between(startDate, endDate).getSeconds();
        double differentMinute = differentSecond / 60;
        double differentHour = differentMinute / 60;
        System.out.println("Chênh lệch giữa ngày bắt đầu và ngày kết thúc là : "
                + differentSecond + " giây, tức là "
                + differentMinute + " phút, tức là "
                + differentHour + " giờ");
    }
}
