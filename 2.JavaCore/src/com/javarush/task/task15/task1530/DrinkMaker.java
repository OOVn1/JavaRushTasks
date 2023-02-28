package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {

    public abstract void getRightCup();
    public abstract void putIngredient();
    public abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
