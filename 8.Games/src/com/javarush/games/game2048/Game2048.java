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
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField.length; x++) {
                setCellColoredNumber(x, y, gameField[y][x]);
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
    private Color getColorByValue(int value){
        if(value == 0) {
            return Color.AQUA;
        } else if (value == 2) {
            return Color.BLUE;
        }else if (value == 4) {
            return Color.BEIGE;
        }else if (value == 8) {
            return Color.DARKGOLDENROD;
        }else if (value == 16) {
            return Color.KHAKI;
        }else if (value == 32) {
            return Color.DARKSLATEGRAY;
        }else if (value == 64) {
            return Color.WHITE;
        }else if (value == 128) {
            return Color.MOCCASIN;
        }else if (value == 256) {
            return Color.MEDIUMSPRINGGREEN;
        }else if (value == 512) {
            return Color.INDIGO;
        }else if (value == 1024) {
            return Color.LIGHTSALMON;
        }else if (value == 2048) {
            return Color.SEAGREEN;
        }else {
            return Color.NONE;
        }

    }
    private void setCellColoredNumber(int x, int y, int value){
        Color color = getColorByValue(value);
        String str = (value > 0) ? value + "" : "";
        setCellValueEx(x, y, color, str);

    }
}

//--module-path "C:\MyProjects\JavaRushTasks\lib\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
