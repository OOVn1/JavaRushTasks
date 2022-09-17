package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a==b && b==c) System.out.println(a+" "+b+" "+c);
        if(a==b && b!=c) System.out.println(a+" "+b);
        if(a==c && b!=c) System.out.println(a+" "+c);
        if(c==b && a!=c) System.out.println(b+" "+c);
    }
}
