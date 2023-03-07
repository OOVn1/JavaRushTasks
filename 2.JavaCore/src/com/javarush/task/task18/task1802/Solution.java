package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int min = Integer.MAX_VALUE;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)){
            while (fileInputStream.available() > 0){
                int x = fileInputStream.read();
                if(x < min) min = x;
            }
        }
        System.out.println(min);
    }
}
