package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        int aChar = 0;
        int space = 0;
        try (FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()){
                aChar++;
                int read = fileReader.read();
                if(read == (int) ' ') space++;
            }
        }
        double v = (double) space / aChar * 100;
        System.out.printf(("%.2f"), v);
    }
}
