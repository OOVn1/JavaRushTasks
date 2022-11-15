package com.javarush.task.pro.task09.task0924;

/* 
Взлом Стального Стива
*/

import java.util.Arrays;

public class Solution {

    public static String[][] morals = {{"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals() {
        for (int i = 0; i < morals.length; i++) {
            for (int j = 0; j < morals[i].length; j++) {
                String element = morals[i][j];
                boolean isKiller = element.toLowerCase().contains("killer");
                boolean isThief = element.toLowerCase().contains("thief");
                boolean isBully = element.toLowerCase().contains("bully");
                if (isKiller) {
                    morals[i][j] = element.replace(element, "compassion");
                } else if (isThief) {
                    morals[i][j] = element.replaceAll(element, "fairness");
                } else if (isBully) {
                    morals[i][j] = element.replaceAll(element, "respect");
                }
            }
        }
    }
}