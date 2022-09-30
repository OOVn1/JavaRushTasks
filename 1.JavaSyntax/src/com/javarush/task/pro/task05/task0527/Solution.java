package com.javarush.task.pro.task05.task0527;

/* 
Подготовка Кибердракона
*/

public class Solution {
    public static int[][] array = new int[5][];

    public static void main(String[] args) {
        //напишите тут ваш код

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
