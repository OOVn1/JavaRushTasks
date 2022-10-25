package com.javarush.task.pro.task08.task0804;

/* 
Randomizer
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишите тут ваш код
        return  (int)(Math.random() * 100);
    }
}
