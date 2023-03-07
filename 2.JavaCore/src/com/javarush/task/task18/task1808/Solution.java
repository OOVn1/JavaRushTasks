package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2)) {

            int lenght1 = (fileInputStream.available() + 1) /2;
            int lenght2 = 0;
            while (fileInputStream.available() > 0){
                if(lenght1 > lenght2){
                    fileOutputStream1.write(fileInputStream.read());
                    lenght2++;
                }else {
                    fileOutputStream2.write(fileInputStream.read());
                }
            }
        }

    }
}
