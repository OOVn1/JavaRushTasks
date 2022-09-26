package com.javarush.task.pro.task03.task0306;

import javax.swing.*;
import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i =0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i =0; i < args.length; i++){
            if (array[i] < min) min = array[i];
        }
        System.out.println(min);
    }
}
