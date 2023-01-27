package unit13.dateTimeAPI.day48.dateTimeTopics.ParsingFormatting;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingCustomFormat {
    public static void main(String[] args) {
        DateTimeFormatter usStyle = DateTimeFormatter.ofPattern("MM.dd.uu");

        LocalDate sahinDate = LocalDate.of(1999, Month.MARCH, 8);
        System.out.println(sahinDate.format(usStyle));

        DateTimeFormatter aslanStyle = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        System.out.println(sahinDate.format(aslanStyle));

        DateTimeFormatter berkStyle = DateTimeFormatter
                .ofPattern("d MMM uuuu");
        System.out.println(sahinDate.format(berkStyle));
    }
}
