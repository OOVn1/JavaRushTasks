package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int n = 0;n<5;n++){
            int chislo = scanner.nextInt();
            sum = sum + chislo;
        }
        System.out.println(sum/5);
    }
}
