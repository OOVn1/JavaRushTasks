package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1])){
            while (reader.ready()){
                for (String word : reader.readLine().split(" ")){
                    if(word.length() > 6){
                        builder.append(word).append(",");
                    }
                }
            }
            writer.write(builder.deleteCharAt(builder.length() - 1).toString());
        }
    }
}
