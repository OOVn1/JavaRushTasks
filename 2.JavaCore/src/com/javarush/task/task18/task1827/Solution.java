package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            int max = 0;
            while (reader.ready()){
                String str = reader.readLine();
                String stringId = str.substring(0, 8).trim();
                int id = Integer.parseInt(stringId);
                if(id > max){
                    max = id;
                }
            }
            if(args.length != 0){
                if(args[0].equals("-c")){
                    String id = checkLength(String.valueOf(max + 1), 8);
                    String productName = checkLength(args[1], 30);
                    String price = checkLength(args[2], 8);
                    String quantity = checkLength(args[3], 4);
                    writer.newLine();
                    writer.write(id + productName + price + quantity);

                }
            }
        }
    }

    private static String checkLength(String str, int limit){
        StringBuilder builder = new StringBuilder(str);
        if(str.length() > limit){
            return str.substring(0, limit);
        }else {
            while (builder.length() != limit){
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}
