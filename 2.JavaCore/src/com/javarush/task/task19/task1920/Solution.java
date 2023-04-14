package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            TreeMap<String, Double> map = new TreeMap<>();
            while (reader.ready()){
                String[] str = reader.readLine().split(" ");
                String name = str[0];
                double value = Double.parseDouble(str[1]);
                if(!map.containsKey(name)){
                    map.put(name, value);
                }else {
                    map.put(name, map.get(name) + value);
                }
            }
            TreeSet<String> set = new TreeSet<>();
            Double max = 0.0;
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                double key = entry.getValue();
                if(key > max){
                    max = key;
                    set.clear();
                    set.add(entry.getKey());
                } else if (key == max) {
                    set.add(entry.getKey());
                }
            }
            for(String name : set){
                System.out.println(name);
            }
        }

    }
}
