package com.javarush.games.snake;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

 class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private int turnDelay;
    private Apple apple;
    private boolean isGameStopped;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void drawScene(){
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.DARKSEAGREEN, "");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }

    private void createGame(){
        turnDelay = 300;
        setTurnTimer(turnDelay);
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        isGameStopped = false;
        drawScene();
    }

     @Override
     public void onTurn(int step) {
         snake.move(apple);
         if(apple.isAlive == false){
             createNewApple();
         }
         if(snake.isAlive == false){
             gameOver();
         }
         drawScene();
     }

     @Override
     public void onKeyPress(Key key) {
         if(key == Key.LEFT){
             snake.setDirection(Direction.LEFT);
         } else if (key == Key.UP) {
             snake.setDirection(Direction.UP);
         }else if (key == Key.RIGHT) {
             snake.setDirection(Direction.RIGHT);
         }else if (key == Key.DOWN) {
             snake.setDirection(Direction.DOWN);
         }
     }

     private void createNewApple(){
         apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
     }

     private void gameOver(){
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "ВЫ ПРОИГРАЛИ", Color.BLACK, 120);
     }
 }
