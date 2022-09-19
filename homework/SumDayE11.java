package datetimehandle.homework;

import java.time.LocalDate;

public class SumDayE11 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, 3, 10);
        System.out.println("Số ngày trong tháng : " + date.lengthOfMonth());
    }
}
