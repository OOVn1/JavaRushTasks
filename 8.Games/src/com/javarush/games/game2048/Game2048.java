package com.javarush.games.game2048;
import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private boolean isGameStopped = false;
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
                setCellColoredNumber(i, j, gameField[j][i]);
            }
        }
    }
    private void createNewNumber(){
        if(getMaxTileValue() == 2048){
            win();
        }
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
    private boolean compressRow(int[] row){
        int index = 0;
        boolean result = false;
        for (int i = 0; i < row.length;i++) {
            if(row[i] > 0){
                if(i != index){
                   row[index]  = row[i];
                   row[i] = 0;
                   result = true;
                }
                index++;
            }
        }
        return result;
    }
    private boolean mergeRow(int[] row){
        boolean result = false;
        for (int i = 0; i < row.length - 1; i++) {
            if(row[i] != 0 && row[i] == row[i+1]){
                row[i] = row[i] + row[i+1];
                row[i+1] = 0;
                result = true;
            }
        }



        return result;
    }

    @Override
    public void onKeyPress(Key key) {
        if(!canUserMove()){
            gameOver();
            return;
        }
        if(key == Key.LEFT){
            moveLeft();
            drawScene();
        }else if (key == Key.RIGHT){
            moveRight();
            drawScene();
        } else if (key == Key.UP) {
            moveUp();
            drawScene();
        } else if (key == Key.DOWN) {
            moveDown();
            drawScene();
        }
    }
    private void moveLeft(){
        boolean flag = false;
        for (int i = 0; i < gameField.length; i++) {
            if(compressRow(gameField[i]) | mergeRow(gameField[i]) | compressRow(gameField[i])){
                flag = true;
            }
        }
        if(flag){
            createNewNumber();
        }
    }
    private void moveRight(){
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }
    private void moveUp(){
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }
    private void moveDown(){
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }
    private void rotateClockwise(){
        int [][] newGameField = new int [SIDE][SIDE];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                newGameField[j][SIDE - 1 - i] = gameField[i][j];
            }
        }
        gameField = newGameField;
    }
    private int getMaxTileValue(){
        int max = gameField[0][0];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if(gameField[i][j] > max){
                    max = gameField[i][j];
                }
            }
        }
        return max;
    }
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.NONE, "You win", Color.GREEN, 75);
    }
    private boolean canUserMove(){
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if(gameField[i][j] == 0){
                    return true;
                }else if(i < SIDE - 1 && gameField[i][j] == gameField[i + 1][j]){
                    return true;
                }else if(j < SIDE - 1 && gameField[i][j] == gameField[i][j + 1]){
                    return true;
                }
            }
        }
        return false;
    }
    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.NONE, "Game over", Color.RED, 75);
    }


}

//--module-path "C:\MyProjects\JavaRushTasks\lib\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
