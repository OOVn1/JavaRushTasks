package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/

import static com.javarush.task.pro.task09.task0923.CaptainBridge.checkAccess;
import static com.javarush.task.pro.task09.task0923.CaptainBridge.debugAccess;

public class Solution {
    public static void main(String[] args) {
        String rang = "";
        if(debugAccess("Раб")) rang = "Раб";
        else if (debugAccess("Гость")) rang = "Гость";
        else if (debugAccess("Боец")) rang = "Боец";
        else if (debugAccess("Ветеран")) rang = "Ветеран";
        else if (debugAccess("Картографист")) rang = "Картографист";
        else if (debugAccess("Капитан")) rang = "Капитан";
        else if (debugAccess("Стив")) rang = "Стив";
        checkAccess(rang);
    }
}
