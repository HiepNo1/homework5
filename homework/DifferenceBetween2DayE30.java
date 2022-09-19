package datetimehandle.homework;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetween2DayE30 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2000, 7, 6);
        LocalDate endDate = LocalDate.of(2022, 6, 8);
        Period different = Period.between(startDate, endDate);
        System.out.println("Chênh lệch giữa ngày bắt đầu và ngày kết thúc là : "
                + different.getYears() + " năm "
                + different.getMonths() + " tháng và "
                + different.getDays() + " ngày");
    }
}
