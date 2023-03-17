package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName1;
        String fileName2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();

            List<Integer> list = new ArrayList<>();
            try (FileReader fileReader = new FileReader(fileName1);
                 FileWriter fileWriter = new FileWriter(fileName2)){
                while (fileReader.ready()){
                    list.add(fileReader.read());
                }
                for (int i = 1; i < list.size(); i += 2) {
                    fileWriter.write(list.get(i));
                }
            }
           
        }
    }
}
