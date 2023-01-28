package unit10.abstractandinterface.day40.rerecordinterfaceintro;

public class GameStation {
    public static void main(String[] args) {
        FifaWorldCup2022 fifaGame = new FifaWorldCup2022();
        fifaGame.triangleButton();
        fifaGame.squareButton();
        fifaGame.circleButton();
        fifaGame.xButton();

        NBA2K23 nbaGame = new NBA2K23();
        nbaGame.triangleButton();
        nbaGame.circleButton();
        nbaGame.squareButton();
        nbaGame.xButton();
    }
}
