package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 1) System.out.println(array[i]);
            else System.out.println(array[array.length - 1 - i]);

        }
    }
}
