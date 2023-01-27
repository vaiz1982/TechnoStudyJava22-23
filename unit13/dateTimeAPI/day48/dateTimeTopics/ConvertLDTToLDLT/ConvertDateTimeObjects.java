package unit13.dateTimeAPI.day48.dateTimeTopics.ConvertLDTToLDLT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ConvertDateTimeObjects {
    public static void main(String[] args) {
        /** from LocalDate to LocalDateTime*/
        LocalDate birtDay = LocalDate.of(2001, Month.OCTOBER, 12);
        System.out.println(birtDay);

        LocalDateTime birtDayWithTime = birtDay.atTime(4,37);
        System.out.println(birtDayWithTime);

        /** from LocalTime to LocalDateTime*/
        LocalTime openingHour = LocalTime.of(11,00);
        System.out.println(openingHour);

        LocalDateTime openingIn2024 = openingHour.atDate(LocalDate.of(2024, Month.JULY, 15));
        System.out.println("The grand opening will be in " + openingIn2024);

        /** from LocalDatetime to LD and LT using toLocalDate() toLocalTime()*/

        LocalDate birthDate = birtDayWithTime.toLocalDate();
        System.out.println("Birth Date is " + birthDate);

        LocalTime openingTime = openingIn2024.toLocalTime();
        System.out.println("It will open at " + openingTime);

    }
}
