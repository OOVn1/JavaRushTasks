package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in);
             FileInputStream file = new FileInputStream(scanner.nextLine());
             BufferedReader reader = new BufferedReader(new InputStreamReader(file))) {
            while (reader.ready()) {
                int number = Integer.parseInt(reader.readLine());
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
            Collections.sort(list);
            list.forEach(a -> System.out.println(a));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
