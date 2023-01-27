package unit13.dateTimeAPI.day48.dateTimeTopics.localDateMethods;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateMethods {
    public static void main(String[] args) {
        /** Create and Get Methods*/
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDayJohnDoe = LocalDate.of(1995, Month.APRIL, 27);
        System.out.println("John Doe was born in " + birthDayJohnDoe);

        System.out.println("John Doe was born in the year of " + birthDayJohnDoe.getYear());
        System.out.println("John Doe was born in the day of " + birthDayJohnDoe.getDayOfWeek());
        System.out.println("John Doe was born in the day of the year " + birthDayJohnDoe.getDayOfYear());

        System.out.println("John Doe was born in the day of "
        + birthDayJohnDoe.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("TR")));
        System.out.println("John Doe was born in the day of "
                + birthDayJohnDoe.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("AR")));
        System.out.println("John Doe was born in the day of "
                + birthDayJohnDoe.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("RU")));

        /** Modify Methods*/
        System.out.println("Three weeks after John was born is " + birthDayJohnDoe.plusWeeks(3));

        /** Modify with with()*/
        System.out.println("First day of the next month after John was born "
                + birthDayJohnDoe.with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());

        System.out.println("Two weeks before John was born is " +
                birthDayJohnDoe.minus(2, ChronoUnit.WEEKS));

        /** isLeapYear()*/
        System.out.println("Is it a leap year? " + LocalDate.now().isLeapYear());
        System.out.println("Is next year a leap year? " + LocalDate.now().plusYears(1).isLeapYear());

        /** isBefore(), isAfter(), isEqual()*/
        LocalDate birthDayJane = LocalDate.of(1970,01,01);
        System.out.println("Jane was born later than John: " + birthDayJane.isAfter(birthDayJohnDoe));

    }
}
