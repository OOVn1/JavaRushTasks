package com.javarush.games.snake;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

 class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private int turnDelay;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void drawScene(){
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellColor(i, j, Color.BLACK);
            }
        }
        snake.draw(this);
    }

    private void createGame(){
        snake = new Snake(WIDTH/2, HEIGHT/2);
        drawScene();
        turnDelay = 300;
        setTurnTimer(turnDelay);
    }

     @Override
     public void onTurn(int step) {
         snake.move();
         drawScene();
     }
 }
