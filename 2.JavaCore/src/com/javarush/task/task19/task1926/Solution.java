package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName = reader.readLine();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
                while (bufferedReader.ready()){
                    String str = bufferedReader.readLine();
                    StringBuilder stringBuilder = new StringBuilder(str);
                    System.out.println(stringBuilder.reverse());
                }
            }
        }
    }
}
