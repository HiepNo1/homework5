package datetimehandle.homework;

import java.time.LocalDate;

public class DayOfMonth13 {
    public static void main(String[] args) {
        LocalDate time = LocalDate.of(2000, 10, 3);
        String day = String.valueOf(time.getDayOfWeek());
        System.out.println("thứ : " + day);
    }
}
