package unit13.dateTimeAPI.day48.dateTimeTopics.LocalDateTimeMethods;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeMethods {
    public static void main(String[] args) {
        /** Create and Access*/
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The Date and Time is " + now);

        LocalDateTime worldCupFinal2022 =
                LocalDateTime.of(2022, Month.DECEMBER, 18, 14, 0);

        System.out.println("The world cup finals in 2022 was played on " + worldCupFinal2022);

        System.out.println("The world cup was played on the day of " + worldCupFinal2022.getDayOfWeek());

        /** modify*/


    }
}
