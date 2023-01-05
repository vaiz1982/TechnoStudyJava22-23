package unit09.inheritance.day35.superkeyword;

import java.util.ArrayList;

public class SoccerPlayer extends Athlete {
    private int cleatSize;
    private ArrayList<String> kickStyles;

    public SoccerPlayer(String name, String team, int cleatSize, ArrayList<String> kickStyles) {
        super(name, team);
        this.cleatSize = cleatSize;
        this.kickStyles = kickStyles;

    }

    public void practice() {
        super.practice();
        for (String kickStyle : kickStyles) {
            System.out.println("Practicing the " + kickStyle);
        }
    }


    public void freeKick() {
        System.out.println("The player is taking a free kick");
    }

    public int getCleatSize() {
        return cleatSize;
    }

    public ArrayList<String> getKickStyles() {
        return kickStyles;
    }
}
