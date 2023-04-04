package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws  IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()){
                String[] words = reader.readLine().split(" ");
                if(Integer.parseInt(words[0]) == Integer.parseInt(args[0])){
                    for(String word : words){
                        System.out.println(word);
                    }
                }
            }
        }
        /*
        Cчитать строку
        Поделить по пробелу
        Найти id и сравнить, если совпали вывести всю строку
         */
    }
}
