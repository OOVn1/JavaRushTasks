package com.javarush.task.pro.task04.task0420;

import java.util.Scanner;

/* 
Страшное число
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(3);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        while (true){
            inputNumber = scanner.nextInt();
            if (inputNumber == number){
                System.out.println("Загадочное число равно " + inputNumber);
                break;
            }
            System.out.println("Попробуй еще раз");
        }
    }
}