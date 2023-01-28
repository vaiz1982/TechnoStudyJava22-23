package unit10.abstractandinterface.day40.rerecordinterfaceintro;

public class FifaWorldCup2022 implements GameController{
    @Override
    public void triangleButton() {
        System.out.println("Pass through. [Fifa]");
    }

    @Override
    public void squareButton() {
        System.out.println("Shoot. [Fifa]");
    }

    @Override
    public void circleButton() {
        System.out.println("Cross Pass. [Fifa]");
    }

    @Override
    public void xButton() {
        System.out.println("Ground pass. [Fifa]");
    }
}
