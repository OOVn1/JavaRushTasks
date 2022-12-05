package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Ivanov", 5.0);
        grades.put("Smirnov", 4.0);
        grades.put("Trofimov", 4.0);
        grades.put("Name", 5.0);
        grades.put("Idfah", 3.0);
    }
}
