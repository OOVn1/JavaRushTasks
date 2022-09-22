package com.javarush.task.pro.task04.task0425;

/* 
Диггер (1)
*/

public class Solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int a = 0; a < 10; a ++){
            if (a == 9){
                for(int i = 0; i<10; i++) {
                    System.out.print(bug);
                }
            }
            else {
                for (int s = 0; s < 10; s++) {
                    if (a == 0 && s == 3) {
                        System.out.print(robot);
                    } else
                        System.out.print(land);
                }
            }
            System.out.println();
        }
    }
}
