package unit09.inheritance.day35.superkeyword;


import java.util.ArrayList;
import java.util.List;

public class AthleteMainClass {
    public static void main(String[] args) {
        ArrayList<String> kicks =
                new ArrayList<>(List.of("Scorpion Kick","Bicycle Kick","Toe kick"));

        SoccerPlayer soccerPlayer = new SoccerPlayer("Hagi", "Galatasaray", 8, kicks);
        soccerPlayer.practice();

        GoalKeeper goalKeeper = new GoalKeeper("Buffon", "Juventus", 10, kicks, 5);

        goalKeeper.practice();
    }
}
