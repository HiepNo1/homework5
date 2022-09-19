package datetimehandle.homework;

import java.time.LocalDateTime;

public class RemainMonth23 {
    public static void main(String[] args) {
        int month = LocalDateTime.now().getMonthValue();
        System.out.println("Tháng còn lại trong năm là : ");
        for (int i = month + 1; i <= 12; i++) {
            System.out.print(i + ", ");
        }
    }
}
