package unit13.dateTimeAPI.day48.dateTimeTopics.periodAndDuration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExamples {
    public static void main(String[] args) {
        Period twoMonths = Period.ofMonths(2);

        System.out.println("the period is " + twoMonths);

        System.out.println(twoMonths.getMonths());

        Period ofCustomPeriod = Period.of(2, 5, 12);
        System.out.println(ofCustomPeriod);

        LocalDate johnBirthDate = LocalDate.of(1999, Month.OCTOBER, 19);
        System.out.println("John is "
                + Period.between(johnBirthDate, LocalDate.now()).getYears()
                + " years old.");
    }
}
