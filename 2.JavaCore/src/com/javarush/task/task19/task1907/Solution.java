package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int world = 0;
            while (reader.ready()) {
                String str = reader.readLine().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
                String[] words = str.split(" ");
                for (String word : words) {
                    if (word.equals("world")) {
                        world++;
                    }
                }
            }
            System.out.println(world);
        }
    }
}
