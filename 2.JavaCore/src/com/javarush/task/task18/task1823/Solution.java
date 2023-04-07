package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String fileName = console.readLine();
            if(fileName.equals("exit")){
                break;
            }
            new ReadThread(fileName).start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            HashMap<Integer, Integer> map = new HashMap<>();
            try (FileInputStream inputStream = new FileInputStream(fileName)){
                while (inputStream.available() > 0){
                    int read = inputStream.read();
                    if(!map.containsKey(read)){
                        map.put(read, 1);
                    }else {
                        map.put(read, map.get(read) + 1);
                    }

                }

            }catch (IOException e){
                throw new RuntimeException(e);
            }

            int max = map.values().stream().max((a, b) -> a - b).get();

            for(Map.Entry<Integer, Integer> pair : map.entrySet()){
                if(pair.getValue().equals(max)){
                    resultMap.put(fileName, pair.getKey());
                }
            }
        }
    }
}
