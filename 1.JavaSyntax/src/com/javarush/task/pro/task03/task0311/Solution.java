package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chislo1 = scanner.nextDouble();
        double chislo2 = scanner.nextDouble();
        if(Math.abs(chislo1-chislo2) < 0.000001)
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
        }


    }

