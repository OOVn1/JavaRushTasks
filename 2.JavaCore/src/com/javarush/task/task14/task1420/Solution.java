package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
            /*  int number1 = Integer.parseInt(console.readLine());
            int number2 = Integer.parseInt(console.readLine());

            for (int i = Math.min(number1, number2); i > 0; i--) {
                if(number1 % i == 0 && number2 % i == 0){
                    System.out.println(i);
                    break;
                }
            }*/

            BigInteger bigInteger1 = new BigInteger(console.readLine());
            BigInteger bigInteger2 = new BigInteger(console.readLine());

            System.out.println(bigInteger1.gcd(bigInteger2));
        }
    }
}
