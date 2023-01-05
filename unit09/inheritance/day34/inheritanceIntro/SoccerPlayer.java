package unit09.inheritance.day34.inheritanceIntro;

import java.util.ArrayList;

public class SoccerPlayer extends Athlete{
    private int cleatSize;
    private ArrayList<String> kickStyles;

    public SoccerPlayer(){
        cleatSize = 9;
        kickStyles = new ArrayList<>();
        kickStyles.add("Trivela kick");
        kickStyles.add("Toe kick");
    }

    public void freeKick(){
        System.out.println("Soccer player is taking a free-kick.");
    }


}
