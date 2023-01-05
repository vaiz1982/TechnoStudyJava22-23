package unit09.inheritance.day34.inheritanceIntro;

public class Goalkeeper extends SoccerPlayer{
    private int gloveSize;

    public Goalkeeper(){
        gloveSize = 4;
    }

    public void goalKick() {
        System.out.println("The goalkeeper is practicing goal kick.");
    }
}
