package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName1))){
            while (bufferedReader.ready()){
                String[] splits = bufferedReader.readLine().split(" ");
                for(String split : splits){
                    if (split.matches("[-+]?\\d+"))
                    writer.write(split + " ");
                }

            }
        }
    }
}
