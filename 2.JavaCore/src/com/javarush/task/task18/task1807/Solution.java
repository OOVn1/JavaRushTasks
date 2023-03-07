package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int count = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)){

            while (fileInputStream.available() > 0){
                if(fileInputStream.read() == 44) count++;
            }
        }
        System.out.println(count);
    }
}
