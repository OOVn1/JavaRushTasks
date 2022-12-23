package com.javarush.task.pro.task13.task1333;

/* 
Спасти рядового Компиляена
*/

import java.util.*;

public class Solution {

    public static List<Integer> ratingsList = new ArrayList<>();

    public static void main(String[] args) {
        setRatings();
        printList(); // before
        improveRatings();
        printList(); // after
    }

    public static void changeNegativeNumbers() {
        for (int i = 0; i < ratingsList.size(); i++) {
            Integer integer = ratingsList.get(i);
            if (integer < 0) {
                integer *= -1;
                ratingsList.set(i, integer);
            }
        }
    }

    public static void changeZerosToMaximumNumber() {
        for (int i = 0; i < ratingsList.size(); i++) {
            int num = ratingsList.get(i);
            int index = ratingsList.indexOf(num);
            if (num == 0) {
                ratingsList.set(index, Collections.max(ratingsList));
            }
        }
    }

    public static void reverseList() {
        ratingsList.sort(Collections.reverseOrder());
    }

    public static void improveRatings() {
        changeNegativeNumbers();
        changeZerosToMaximumNumber();
        reverseList();
    }

    private static void setRatings() {
        int rating;
        Random random = new Random();
        int min = -5;
        int max = 11;

        for (int i = 0; i < 20; i++) {
            rating = random.nextInt(max - min) + min;
            ratingsList.add(rating);
        }
    }

    private static void printList() {
        ratingsList.forEach((value) -> System.out.print(value + " "));
        System.out.println();
    }
}