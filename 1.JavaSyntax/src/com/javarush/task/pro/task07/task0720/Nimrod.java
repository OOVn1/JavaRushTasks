package com.javarush.task.pro.task07.task0720;

public class Nimrod {
    public static int laser = 100_000;
    public static int rocket = 10_000;
    public static int angelicaKiss;
    public int health = 1_000_000;

    public void defend(int defend){
        health -= applyShield(defend);

    }
    public int attack(){
        return angelicaKiss;
    }
    public byte applyShield (int applyShield){
        return (byte) applyShield;
    }
}
