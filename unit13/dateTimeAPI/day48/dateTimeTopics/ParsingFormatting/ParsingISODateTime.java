package unit13.dateTimeAPI.day48.dateTimeTopics.ParsingFormatting;

import java.time.LocalDate;
import java.time.LocalTime;

public class ParsingISODateTime {
    public static void main(String[] args) {

        /** parsing a string to a LocalDate in ISO Format*/
        String stringDate = "2023-01-19";

        LocalDate parsedDate = LocalDate.parse(stringDate);
        System.out.println(parsedDate);
        System.out.println(parsedDate.getDayOfWeek());

        /** parsing a string to a LocalTime in ISO Format*/
        String stringTime = "17:35";
        LocalTime parsedTime = LocalTime.parse(stringTime);
        System.out.println(parsedTime.plusHours(1));

        /** Custom format needs DateTimeFormatter*/
        /**
         * String stringCustomDate = "12/1/23";
        LocalDate parsedCustomDate = LocalDate.parse(stringCustomDate);
        System.out.println(stringCustomDate);*/
    }
}
