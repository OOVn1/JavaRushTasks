package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.*;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new LinkedHashMap<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()){
                String str = reader.readLine();
                String key = str.substring(0, 8).trim();
                if(!map.containsKey(key)){
                    map.put(key, str.substring(8));
                }
            }
        }
        if(args.length != 0){
            if(args[0].equals("-u")){
                String id = args[1].trim();
                for (Map.Entry<String, String> pair : map.entrySet()) {
                    if(id.equals(pair.getKey())){
                        map.put(id, checkLength(args[2], 30) +
                                checkLength(args[3], 8) + checkLength(args[4], 4));
                    }
                }
            } else if (args[0].equals("-d")) {
                String id = args[1].trim();
                Set<String> keySet = new HashSet<>(map.keySet());
                for(String key : keySet){
                    if(key.equals(id)){
                        map.remove(key);
                    }
                }
                //map.entrySet().removeIf(pair -> pair.getKey().equals(id));
            }

        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for (Map.Entry<String, String> pair : map.entrySet()) {
                writer.write(checkLength(pair.getKey(), 8) + pair.getValue());
                writer.newLine();
            }
        }
    }

    private static String checkLength(String str, int limit){
        StringBuilder builder = new StringBuilder(str);
        if(str.length() > limit){
            return str.substring(0, limit);
        } else {
            while (builder.length() != limit){
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}
