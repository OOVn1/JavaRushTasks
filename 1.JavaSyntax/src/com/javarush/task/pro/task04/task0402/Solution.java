package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        int a = 10;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while(a>0){
            System.out.println(name + text);
            a--;
        }

    }
}
