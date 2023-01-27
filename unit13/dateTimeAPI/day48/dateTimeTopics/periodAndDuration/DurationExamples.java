package unit13.dateTimeAPI.day48.dateTimeTopics.periodAndDuration;

import java.time.Duration;

public class DurationExamples {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(4);

        System.out.println(duration);

        System.out.println(); duration.plusMinutes(15);

    }
}
