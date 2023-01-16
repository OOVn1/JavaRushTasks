package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);
            InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
            OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            byte[] bytesIn = inputStream.readAllBytes();
            for (int i = 0; i < bytesIn.length; i += 2) {
                if(i < bytesIn.length - 1){
                    byte aByte = bytesIn[i];
                    bytesIn[i] = bytesIn[i + 1];
                    bytesIn[i + 1] = aByte;
                }
            }
            outputStream.write(bytesIn);
        }catch (IOException e){
        }
    }
}
