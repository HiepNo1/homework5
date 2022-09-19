package datetimehandle.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Day33 {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate previousDay = nowDate.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        LocalDate nextDay = nowDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("ngay thu 6 tuan truoc la  " + previousDay);
        System.out.println("ngay thu 6 tuan sau la  " + nextDay);
    }
}
