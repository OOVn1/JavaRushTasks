package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner (System.in);
        boolean a = scanner.nextBoolean();
        int x = 0;
        if(a == true) {
            glass = Math.ceil(glass);
            x = (int) Math.round(glass);
        }
        if(a == false) {
            glass = Math.floor(glass);
            x = (int) Math.round(glass);
        }
        System.out.println(x);

    }
}