package com.javarush.games.moonlander;

public class Rocket extends GameObject{

    private double speedX = 0;
    private double speedY = 0;
    private double boost = 0.05;

    public void move(boolean isUpPressed, boolean isLeftPressed, boolean isRightPressed){
        if(isUpPressed){
            speedY -= boost;
        }else {
            speedY += boost;
        }
        y += speedY;
        if(isLeftPressed){
            speedX -= boost;
            x += speedX;
        } else if (isRightPressed) {
            speedX += boost;
            x += speedX;

        }


    }

    public Rocket(double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
    }
}
