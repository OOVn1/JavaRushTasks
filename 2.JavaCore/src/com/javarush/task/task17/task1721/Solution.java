package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileName2))){
            while (bufferedReader1.ready()){
                allLines.add(bufferedReader1.readLine());
            }

            while (bufferedReader2.ready()){
                forRemoveLines.add(bufferedReader2.readLine());
            }
            new Solution().joinData();
        }catch (CorruptedDataException e){

        }

    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
