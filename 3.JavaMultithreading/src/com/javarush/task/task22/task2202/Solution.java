package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if(string == null) throw new TooShortStringException();
        String[] split = string.split(" ");
        if (split.length < 5) throw new TooShortStringException();
        return split[1] + " " + split[2] + " " + split[3] + " " + split[4];
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
