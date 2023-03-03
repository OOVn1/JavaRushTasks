package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String str = url.substring(url.lastIndexOf("?") + 1);
        String[] splits = str.split("&");
        for(String split : splits){
            if(split.contains("=")){
                int index = split.indexOf("=");
                String substring = split.substring(0, index);
                System.out.print(substring + " ");
            }else {
                System.out.print(split + " ");
            }
        }
        System.out.println();
        for (String split : splits){
            if(split.contains("obj")){
                String substring = split.substring(split.indexOf("=") + 1);
                try {
                    alert(Double.parseDouble(substring));
                }catch (NumberFormatException e){
                    alert(substring);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
