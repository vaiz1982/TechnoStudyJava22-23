package unit09.inheritance.day34.inheritanceIntro;

public class HockeyPlayer extends Athlete{
    private int skateSize;

    public HockeyPlayer(){
        skateSize = 8;
    }

    public void shoot(){
        System.out.println("Hockey player is shooting.");
    }

    public void pass(){
        System.out.println("Hockey player is passing.");
    }

}
