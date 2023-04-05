package com.javarush.games.moonlander;

public class Rocket extends GameObject{

    private double speedX = 0;
    private double speedY = 0;
    private double boost = 0.05;
    private double slowdown = boost/10;

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

        if (!isLeftPressed && !isRightPressed && speedX > -slowdown && speedX <= slowdown){
            speedX = 0;
            x += speedX;
        } else if (!isLeftPressed && !isRightPressed && speedX > slowdown) {
            speedX -= slowdown;
            x += speedX;
        } else if (!isLeftPressed && !isRightPressed && speedX < -slowdown) {
            speedX += slowdown;
            x += speedX;
        }
        checkBorders();
    }

    public Rocket(double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
    }

    private void checkBorders(){
        if(x < 0){
            x = 0;
            speedX = 0;
        }
        if(x + width > MoonLanderGame.WIDTH){
            x = MoonLanderGame.WIDTH - width;
            speedX = 0;
        }
        if(y < 0){
            y = 0;
            speedY = 0;
        }

    }
}
