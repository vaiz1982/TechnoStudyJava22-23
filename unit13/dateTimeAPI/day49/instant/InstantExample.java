package unit13.dateTimeAPI.day49.instant;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        /** Instant*/
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println(now.getEpochSecond());


        System.out.println(Instant.ofEpochSecond(0));

        System.out.println(Instant.ofEpochSecond(92832342L));
    }
}
