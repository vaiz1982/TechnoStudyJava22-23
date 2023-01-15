package unit10.abstractandinterface.day40.interfaceintro;

public class FifaWorldCup2022 implements GameController{
    @Override
    public void triangleButton() {
        System.out.println("Pass through. [Soccer]");
    }

    @Override
    public void squareButton() {
        System.out.println("Shoot.  [Soccer]");
    }

    @Override
    public void circleButton() {
        System.out.println("Cross Pass. [Soccer]");
    }

    @Override
    public void xButton() {
        System.out.println("Ground Pass. [Soccer]");
    }
}
