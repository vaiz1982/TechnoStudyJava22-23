package unit10.abstractandinterface.day40.interfaceintro;

public class GameStation {
    public static void main(String[] args) {
        FifaWorldCup2022 fifaGame = new FifaWorldCup2022();
        fifaGame.squareButton();
        fifaGame.triangleButton();
        fifaGame.circleButton();
        fifaGame.xButton();

        NBA2K23 nba2K23 = new NBA2K23();
        nba2K23.circleButton();
        nba2K23.triangleButton();
        nba2K23.squareButton();
        nba2K23.xButton();
    }
}
