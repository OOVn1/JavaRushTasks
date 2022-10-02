package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        multiArray = new int[number][];
        for (int i = 0; i < number; i++) {
            int num = scanner.nextInt();
            multiArray[i] = new int[num];
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = 0;
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
    }
}
