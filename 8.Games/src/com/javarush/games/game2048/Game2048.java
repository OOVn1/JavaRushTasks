package com.javarush.games.game2048;
import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }
    private void createGame(){
        createNewNumber();
        createNewNumber();
    }
    private void drawScene(){
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                setCellColor(i, j, Color.RED);
            }
        }
    }
    private void createNewNumber(){
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        if(gameField[x][y] == 0){
            if(getRandomNumber(10) == 9){
                gameField[x][y] = 4;
            } else {
                gameField[x][y] = 2;
            }
        }else{
            createNewNumber();
        }
    }
}
//--module-path "C:\MyProjects\JavaRushTasks\lib\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
