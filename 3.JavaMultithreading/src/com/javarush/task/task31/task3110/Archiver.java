package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Archiver {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите путь для архивации");
        Scanner scanner = new Scanner(System.in);
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(scanner.nextLine()));
        System.out.println("Введите путь к файлу, который необходимо архивировать");
        zipFileManager.createZip(Paths.get(scanner.nextLine()));
        new ExitCommand().execute();
    }
}
