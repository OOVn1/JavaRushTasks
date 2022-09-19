package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        if( stroka1.equals ( stroka2 )){
        System.out.println("строки одинаковые");}
        else
        System.out.println("строки разные");
    }
}
