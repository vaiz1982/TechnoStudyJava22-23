package unit10.abstractandinterface.day40.interfaceintro;

public class NBA2K23 implements GameController{
    @Override
    public void triangleButton() {
        System.out.println("Lob Pass. [Basketball]");
    }

    @Override
    public void squareButton() {
        System.out.println("Shoot.  [Basketball]");
    }

    @Override
    public void circleButton() {
        System.out.println("Bounce Pass.  [Basketball]");
    }

    @Override
    public void xButton() {
        System.out.println("Pass.  [Basketball]");
    }
}
