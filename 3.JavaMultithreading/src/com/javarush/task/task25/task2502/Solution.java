package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            List<Wheel> list = new ArrayList<>();
            String[] wheelNamesFromDB = loadWheelNamesFromDB();
            if(wheelNamesFromDB.length != 4) throw new IllegalArgumentException();
            for (int i = 0; i < wheelNamesFromDB.length; i++) {
                list.add(Wheel.valueOf(wheelNamesFromDB[i]));
            }
            if(list.size() != 4) throw new IllegalArgumentException();
            wheels = new ArrayList<>(list);
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
