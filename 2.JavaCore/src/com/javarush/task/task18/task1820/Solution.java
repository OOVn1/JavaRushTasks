package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        FileWriter fileWriter = new FileWriter(fileName2)){
            while (bufferedReader.ready()){
                String[] splits = bufferedReader.readLine().split(" ");
                for(String split : splits){
                    double numberD = Double.parseDouble(split);
                    long round = Math.round(numberD);
                    fileWriter.write(round + " ");
                }
            }

        }

    }
}
