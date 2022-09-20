package datetimehandle.homework;

import java.time.LocalDate;

public class Month26 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        int monthNow = timeNow.getMonth().getValue();
        System.out.println("Tháng hiện tại : " + monthNow);
        LocalDate lastMonth = timeNow.withDayOfMonth(timeNow.lengthOfMonth());
        System.out.println("thoi luong cua thang la " + lastMonth);
        /**
         * check condition
         * how to print without if else
         */
        if (1 <= monthNow & monthNow <= 3) {
            System.out.println("Tháng đầu của Quý là 1");
        } else if (4 <= monthNow & monthNow <= 6) {
            System.out.println("Tháng đầu của Quý là 4");
        } else if (7 <= monthNow & monthNow <= 9) {
            System.out.println("Tháng đầu của Quý là 7");
        } else {
            System.out.println("Tháng đầu của Quý là 10");
        }
    }
}
