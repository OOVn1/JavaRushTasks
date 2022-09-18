package com.javarush.task.pro.task03.task0306;

import javax.swing.*;
import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double storona1 = scanner.nextDouble();
        double storona2 = scanner.nextDouble();
        double storona3 = scanner.nextDouble();
        if (storona1 + storona2 > storona3 && storona1 + storona3 > storona2 && storona2 + storona3 > storona1){
            System.out.println(TRIANGLE_EXISTS);}
            else{
                System.out.println(TRIANGLE_NOT_EXISTS);


        }


    }
}
