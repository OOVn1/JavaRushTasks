package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            List <String> list = new ArrayList<>();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))){
                while (bufferedReader.ready()){
                    list.add(bufferedReader.readLine());
                }

                for(String s : list){
                    bufferedWriter.write(s.replaceAll("\\p{P}", ""));
                }
            }
        }
    }
}
