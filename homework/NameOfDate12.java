package datetimehandle.homework;

import java.time.LocalDate;

public class NameOfDate12 {
    public static String weekdayVN(LocalDate time) {
        String name = null;
        switch (time.getDayOfWeek()) {
            case MONDAY:
                name = "Thứ hai";
                break;
            case TUESDAY:
                name = "Thứ ba";
                break;
            case WEDNESDAY:
                name = "Thứ tư";
                break;
            case THURSDAY:
                name = "Thứ năm";
                break;
            case FRIDAY:
                name = "Thứ sáu";
                break;
            case SATURDAY:
                name = "Thứ bảy";
                break;
            case SUNDAY:
                name = "Chủ nhật";
                break;
        }
        return name;
    }
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        System.out.println("Ngày hiện tại là : " + weekdayVN(timeNow));
    }
}
