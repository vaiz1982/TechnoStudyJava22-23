package unit09.inheritance.day38.polymorphism;

public class HockeyPlayer extends Athlete{

    public HockeyPlayer(String name) {
        super(name);
    }

    @Override
    public void practice() {
        super.practice();
        shoot();
        pass();
    }

    public void shoot(){
        System.out.println("The player is shooting the puck.");
    }

    public void pass() {
        System.out.println("The player is passing the puck.");
    }
}
