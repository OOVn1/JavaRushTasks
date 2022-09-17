package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int vozr = s.nextInt();
        if(vozr>17 && vozr<29) System.out.println(name+militaryCommissar);

    }
}
