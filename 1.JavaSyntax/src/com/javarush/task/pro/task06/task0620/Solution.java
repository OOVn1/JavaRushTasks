package com.javarush.task.pro.task06.task0620;

/* 
Мракобес Безумный
*/

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Mrakobes.setIsAlive(false);
        Mrakobes.printState();
        for (int i = 0; i < 10; i++) {
            new Mrakobes();
        }

        System.out.println(Mrakobes.count);

    }
}
