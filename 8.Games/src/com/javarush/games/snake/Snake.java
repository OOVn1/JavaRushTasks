package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    private Direction direction = Direction.LEFT;

    public boolean isAlive = true;


    private final List<GameObject> snakeParts = new ArrayList<>();

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        Color color;
        for (int i = 0; i < snakeParts.size(); i++) {
            if (isAlive) {
                color = Color.BLACK;
            } else {
                color = Color.RED;
            }
            if (i == 0) {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, color, 75);
            } else {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, color, 75);
            }
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
    }

    public GameObject createNewHead() {
        if (direction == Direction.LEFT) {
            return new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
        } else if(direction == Direction.DOWN){
            return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
        } else if(direction == Direction.RIGHT){
            return new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
        }else {
            return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
        }
    }

    public void removeTail(){
       snakeParts.remove(snakeParts.size() - 1);
    }
}
