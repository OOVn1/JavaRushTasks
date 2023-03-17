package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Arrays;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = console.readLine();

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();

        try (InputStream inputStream1 = new FileInputStream(fileName1);
             InputStream inputStream2 = new FileInputStream(console.readLine())) {
            while (inputStream2.available() > 0) {
                arrayOutputStream.write(inputStream2.read());
            }
            while (inputStream1.available() > 0) {
                arrayOutputStream.write(inputStream1.read());
            }
        }
        try (OutputStream outputStream = new FileOutputStream(fileName1)) {
           arrayOutputStream.writeTo(outputStream);

        }

    }
}
