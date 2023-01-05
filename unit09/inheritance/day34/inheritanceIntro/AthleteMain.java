package unit09.inheritance.day34.inheritanceIntro;

public class AthleteMain {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        System.out.println(athlete.getName());
        athlete.practice();
        /*athlete is not a swimmer
        athlete doesn't have a dive method.
        athlete.dive();*/

        Swimmer swimmer = new Swimmer();
        System.out.println(swimmer.getName());
        swimmer.practice();
        swimmer.dive();

        System.out.println(swimmer.getSwimStyle());



    }
}
