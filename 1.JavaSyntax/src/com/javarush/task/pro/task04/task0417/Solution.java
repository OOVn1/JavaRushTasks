package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        double b = (a * 1.0) * 3.6;
        int x = (int) Math.round(b);
        System.out.println(x);
    }
}