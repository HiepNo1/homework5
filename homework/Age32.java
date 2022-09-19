package datetimehandle.homework;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Age32 {
    public static int calculateAge (LocalDate dateOfBirth) {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dateOfBirth = null;
        System.out.println("Nhập ngày sinh của bạn : ");
        try {
            dateOfBirth = LocalDate.parse(scanner.nextLine());
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        System.out.println("Tuổi của bạn là : " + calculateAge(dateOfBirth));
    }
}
