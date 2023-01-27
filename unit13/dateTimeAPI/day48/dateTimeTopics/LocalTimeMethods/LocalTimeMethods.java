package unit13.dateTimeAPI.day48.dateTimeTopics.LocalTimeMethods;

import java.time.LocalTime;

public class LocalTimeMethods {
    public static void main(String[] args) {

        /** Create and Access Methods*/
        LocalTime rightNow = LocalTime.now();
        System.out.println("Right now the time is " + rightNow);

        LocalTime openingHourOfDunkin = LocalTime.of(6, 0);
        System.out.println("Dunkin opens at " + openingHourOfDunkin + " in the morning");

        System.out.println("Dunkin opens at the hour of " + openingHourOfDunkin.getHour());

        /** Modify Time methods*/
        System.out.println("I will go to Panera after 4 hours than Dunkin "
                + openingHourOfDunkin.plusHours(4));

        /** isAfter(), isBefore(), isEqual()*/
        LocalTime starbucksOpeningHour = LocalTime.of(5,30);

        System.out.println("Starbucks opens before Dunkin: "
                + starbucksOpeningHour.isBefore(openingHourOfDunkin));
    }
}
