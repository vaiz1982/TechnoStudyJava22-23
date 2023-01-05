package unit09.inheritance.day35.overriding;

public class Athlete {
    private String name;
    private String team;

    public Athlete(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public void practice(){
        System.out.println("The athlete is practicing.");
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

}
