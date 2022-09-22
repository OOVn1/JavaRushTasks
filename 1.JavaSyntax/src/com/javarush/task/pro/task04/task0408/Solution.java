package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        int max = -20000000;
        boolean isExit = false;
        Scanner scanner = new Scanner (System.in);
        while(true){
            int a = scanner.nextInt();
            if( a % 2 == 0 && max < a) max = a;

        }

    }
}