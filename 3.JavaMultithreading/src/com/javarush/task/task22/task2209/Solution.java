package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] words = null;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                words = reader.readLine().split(" ");
            }
        }
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if(words == null || words.length == 0){
            return new StringBuilder();
        }
        StringBuilder builder = new StringBuilder();
        List<StringBuilder> builderList = new ArrayList<>();
        for (String word : words) {
            builder.append(word);
            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);

            int count = 0;
            while (!list.isEmpty()){
                String firstStartChar = builder.substring(0, 1);
                String firstEndChar = builder.substring(builder.length() - 1);

                String second = list.get(0);
                String secondStartChar = second.substring(0, 1);
                String secondEndChar = second.substring(second.length() - 1);

                if (firstStartChar.equalsIgnoreCase(secondEndChar)) {
                    builder.insert(0, second + " ");
                    list.remove(second);
                } else if (firstEndChar.equalsIgnoreCase(secondStartChar)) {
                    builder.append(" ").append(second);
                    list.remove(second);
                } else {
                    list.remove(second);
                    list.add(second);
                    count++;
                    if(count > Math.pow(words.length, 2)){
                        break;
                    }
                }
            }
            builderList.add(builder);
            builder = new StringBuilder();
        }
        return builderList.stream().max(Comparator.comparingInt(StringBuilder::length)).get();
        /*int max = 0;
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : builderList) {
            if(stringBuilder.length() > max){
                max = stringBuilder.length();
            }
        }
        for (StringBuilder stringBuilder : builderList) {
            if(stringBuilder.length() == max){
                result = stringBuilder;
            }
        }
        return result;*/
    }
}
