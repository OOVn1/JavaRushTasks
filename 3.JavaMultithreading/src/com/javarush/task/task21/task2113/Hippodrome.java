package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Наташа", 3, 0));
        horses.add(new Horse("Натали", 3, 0));
        horses.add(new Horse("Наталья", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse hors : horses) {
            hors.move();
        }
    }

    void print() {
        for (Horse hors : horses) {
            hors.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        Horse result = horses.get(0);
        for (Horse horse : horses) {
            if (horse.getDistance() > result.getDistance())
                result = horse;
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
