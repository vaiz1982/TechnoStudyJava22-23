package unit13.dateTimeAPI.day49.ZonedDateTimeClass;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FlightTimeCalculation {
    public static void main(String[] args) {
        /**
         * A flight from NY to Paris
         * Departure from NY is 2023 July 2 22:30
         * Flight Duration is 8 hours
         * What is the Arrival Time to Paris in Paris Time
         * */

        ZonedDateTime nyDeparture
                = ZonedDateTime.of(LocalDateTime.of(2023, Month.JULY, 2, 22, 30), ZoneId.of("America/New_York"));
        System.out.println("Depart from NY at " + nyDeparture);

        ZonedDateTime parisArrival
                = nyDeparture.plusHours(8).withZoneSameInstant(ZoneId.of("Europe/Paris"));

        System.out.println("Arrival to Paris at " + parisArrival);




    }
}
