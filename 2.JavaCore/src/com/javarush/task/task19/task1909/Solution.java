package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = reader.readLine();
            String file2 = reader.readLine();

            List<String> list = new ArrayList<>();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
                while (bufferedReader.ready()) {
                    list.add(bufferedReader.readLine());
                }

                for (int i = 0; i < list.size(); i++) {
                    bufferedWriter.write(list.get(i).replaceAll("\\.", "!"));
                }
            }

        }
    }
}
