package datetimehandle.homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class FinalDayE8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày : ");
        LocalDate time = null;
        try {
            time = LocalDate.parse(scanner.nextLine());
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        LocalDate lastDate = time.withDayOfMonth(time.lengthOfMonth());
        System.out.println("Ngày cuối cùng của tháng là : " + lastDate);
    }
}
