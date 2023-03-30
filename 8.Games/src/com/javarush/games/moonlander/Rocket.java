package com.javarush.games.moonlander;

public class Rocket extends GameObject{

    private double speedY = 0;
    private double boost = 0.05;

    public void move(){
        speedY += boost;
        y += speedY;
    }

    public Rocket(double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
    }
}
