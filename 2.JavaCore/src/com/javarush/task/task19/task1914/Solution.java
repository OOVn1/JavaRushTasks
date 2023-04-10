package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream consoleStream = System.out;
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(consoleStream);
        String[] strings = outputStream.toString().split(" ");
        int number1 = Integer.parseInt(strings[0]);
        int number2 = Integer.parseInt(strings[2]);
        int result = 0;
        if(strings[1].equals("+")){
            result = number1 + number2;
        }else if(strings[1].equals("-")){
            result = number1 - number2;
        } else if (strings[1].equals("*")) {
            result = number1 * number2;
        }
        System.out.println(number1 + " " + strings[1] + " " + number2 + " = " + result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

