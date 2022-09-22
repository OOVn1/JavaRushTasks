package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        while(a < 100){
            a++;
            if(a % 2 != 0) continue;
            sum = sum + a;
        }
        System.out.println(sum);
    }
}