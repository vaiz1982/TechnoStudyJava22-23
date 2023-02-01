package unit13.dateTimeAPI.day49.ZonedDateTimeClass;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExamples {
    public static void main(String[] args) {
        ZonedDateTime timeInNY = ZonedDateTime.now();
        System.out.println(timeInNY);

        System.out.println(timeInNY.getOffset());
        System.out.println(timeInNY.getZone());

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Paris")));

        System.out.println(ZonedDateTime.now(ZoneId.of("Africa/Casablanca")));


        ZonedDateTime nyNextWeek
                = ZonedDateTime.of(2023,1, 30, 14, 30, 0, 0, ZoneId.of("America/New_York"));
        System.out.println(nyNextWeek);
        System.out.println(nyNextWeek.withZoneSameInstant(ZoneId.of("Europe/Paris")));
        //This change from GitHub
    }
}
