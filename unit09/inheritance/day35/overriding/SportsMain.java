package unit09.inheritance.day35.overriding;

import java.util.ArrayList;
import java.util.List;

public class SportsMain {
    public static void main(String[] args) {
        Athlete athlete =
                new Athlete("John Doe", "Team USA");
        athlete.practice();



        ArrayList<String> kicks =
                new ArrayList<>(List.of("Scorpion Kick","Bicycle Kick","Toe kick"));

        SoccerPlayer soccerPlayer = new SoccerPlayer("Hagi", "Galatasaray", 8, kicks);

        soccerPlayer.practice();
        soccerPlayer.freeKick();

        HockeyPlayer hockeyPlayer = new HockeyPlayer("Ovechkin", "Calgry Flames", 9);



        hockeyPlayer.practice();
    }
}
