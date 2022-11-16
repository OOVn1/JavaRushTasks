package com.javarush.task.pro.task10.task1003;

/* 
Построим новый бизнес-комплекс JavaRush Business Center
*/

public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper(int number, String str){
        floorsCount = number;
        developer = str;
    }
    public Skyscraper(){
        floorsCount = 5;
        developer = "JavaRushDevelopment";
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
    }
}
