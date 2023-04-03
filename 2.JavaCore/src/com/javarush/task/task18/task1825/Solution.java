package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String fileName = console.readLine();
            if(fileName.equals("end")){
                break;
            }
            int index = Integer.parseInt(fileName.substring(fileName.lastIndexOf("t") + 1));
            if(!treeMap.containsKey(index)){
                treeMap.put(index, fileName);
            }
        }
        for(String fileName : treeMap.values()){
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(fileName));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(shortName, true))){
                while (input.available() > 0){
                    output.write(input.read());
                }
            }
        }
    }
}
