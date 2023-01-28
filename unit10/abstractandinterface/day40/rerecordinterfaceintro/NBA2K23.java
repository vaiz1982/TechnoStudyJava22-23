package unit10.abstractandinterface.day40.rerecordinterfaceintro;

public class NBA2K23 implements GameController{
    @Override
    public void triangleButton() {
        System.out.println("Lob pass. [NBA]");
    }

    @Override
    public void squareButton() {
        System.out.println("Shoot. [NBA]");
    }

    @Override
    public void circleButton() {
        System.out.println("Bounce Pass. [NBA]");
    }

    @Override
    public void xButton() {
        System.out.println("Pass. [NBA]");
    }
}
