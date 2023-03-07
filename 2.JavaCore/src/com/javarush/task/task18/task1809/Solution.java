package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        List<Integer> array = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2)){
            while (fileInputStream.available() > 0){
                array.add(fileInputStream.read());
            }
            Collections.reverse(array);
            for (Integer ar : array){
                fileOutputStream.write(ar);
            }
        }

    }
}
