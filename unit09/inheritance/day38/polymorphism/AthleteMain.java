package unit09.inheritance.day38.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AthleteMain {
    public static void main(String[] args) {
            Athlete athlete1 = new HockeyPlayer("Tim Horton");
            Athlete athlete2 = new Swimmer("Michael Phelps");

        ArrayList<Athlete> athletes =
                new ArrayList<>(List.of(athlete1,athlete2));

        for (Athlete athlete :athletes) {
            athlete.practice();
            if(athlete instanceof HockeyPlayer){
                System.out.println("Shoot for us");

            }
        }
    }
}
