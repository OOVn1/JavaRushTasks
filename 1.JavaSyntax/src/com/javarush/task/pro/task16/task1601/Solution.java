package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(2003, 06, 29);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int day = date.getDay();
        String week = "";
        switch (day){
            case 0: return week = "Воскресенье";
            case 1: return week = "Понедельник";
            case 2: return week = "Вторник";
            case 3: return week = "Среда";
            case 4: return week = "Четверг";
            case 5: return week = "Пятница";
            case 6: return week = "Суббота";
        }
        return week;
    }
}
