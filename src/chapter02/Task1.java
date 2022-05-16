package chapter02;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Change the calendar printing program, so it starts the week on a Sunday. Also
 * make it print a newline at the end (but only one).
 */

public class Task1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int month = date.getMonthValue();

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        for (int i = 7; i > value; i--)
            System.out.print("    ");

        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 7) System.out.println();
    }
}
