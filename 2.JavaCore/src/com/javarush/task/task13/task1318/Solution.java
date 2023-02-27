package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream file = new FileInputStream(console.readLine());
             BufferedReader reader = new BufferedReader(new InputStreamReader(file))){

            while (reader.ready()){
                System.out.println(reader.readLine());
            }



        }


    }
}