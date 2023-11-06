package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Archiver {

    public static void main(String[] args) throws Exception {
        Operation operation = null;
        while (!Operation.EXIT.equals(operation)){
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            }catch (WrongZipFileException e){
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            }catch (Exception e){
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        }
    }

    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("Выберите операцию:\n" +
                "0 - упаковать файлы в архив\n" +
                "1 - добавить файл в архив\n" +
                "2 - удалить файл из архива\n" +
                "3 - распаковать архив\n" +
                "4 - просмотреть содержимое архива\n" +
                "5 - выход");
        int number = ConsoleHelper.readInt();
        Operation[] values = Operation.values();
        return values[number];
    }
}
