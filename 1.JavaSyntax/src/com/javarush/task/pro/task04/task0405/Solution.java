package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        while(a <= 10){
            a++;
            int b = 0;
            while (b <= 20){
                b++;
                if( a== 1 || a == 20)
                    System.out.print("Б");
                else {
                    int i = 0;
                    while (i <= 20){
                        i++;
                        if( i == 1 || i == 20)
                            System.out.print("Б");
                        else System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }

    }
}