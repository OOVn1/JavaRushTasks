package com.javarush.task.pro.task05.task0523;

/* 
Охота на Кибердракона
*/

public class Solution {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int sumn = 0;
        int sumh = 0;
        for (int i = 0; i < coordinates.length; i++){
            if (coordinates[i] % 2 == 1) sumn = sumn + coordinates[i];
            else sumh = sumh + coordinates[i];
        }
        System.out.println("("+sumn+";"+sumh+")");
    }
}
