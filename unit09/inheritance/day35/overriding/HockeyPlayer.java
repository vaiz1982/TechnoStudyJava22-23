package unit09.inheritance.day35.overriding;

public class HockeyPlayer extends Athlete {
    private int skateSize;

    public HockeyPlayer(String name, String team, int skateSize) {
        super(name, team);
        this.skateSize = skateSize;
    }

    public void practice(){
        System.out.println("Hockey player is in practice session");
        pass();
        shoot();
    }

    public void shoot(){
        System.out.println("Hockey player is practicing shooting");
    }

    public void pass(){
        System.out.println("Hockey player is workin on passing skills.");
    }

    public int getSkateSize() {
        return skateSize;
    }


}
