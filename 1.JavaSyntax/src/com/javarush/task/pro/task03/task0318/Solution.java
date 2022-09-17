package com.javarush.task.pro.task03.task0318;

import java.util.Scanner;

/* 
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int chas=s.nextInt();
        int min=s.nextInt();
        if(min<30 && chas==0) System.out.println(NOT_YET);
        if(min==30 && chas==0) System.out.println(DONE);
        if(min>30 && chas==0) System.out.println(HORRIBLY_DONE);
        if( chas>0) System.out.println(HORRIBLY_DONE);
    }
}
