package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 20) {
                if( i == 0 || i == 9) {
                    System.out.print("Б");
                }
                else if ( j == 0 || j ==19){
                    System.out.print("Б");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}