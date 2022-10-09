package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(100000000));
    }

    public static long cube(long x) {
        long y = x * x * x;
        return y;
    }
}
