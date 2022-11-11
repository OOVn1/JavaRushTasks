package com.javarush.task.pro.task09.task0921;

/* 
Пиратский разворот
*/

import java.util.Arrays;

public class NimrodAi {
    
    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (int i = 0; i < pastryLoaders.length; i++) {
            System.out.println(Arrays.deepToString(pastryLoaders[i].memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (int i = 0; i < pastryLoaders.length; i++) {
           PastryLoader element = pastryLoaders[i];
           String[][][] array = element.memory;
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    for (int l = 0; l < array[j][k].length; l++) {
                        String string = array[j][k][l];
                        String str = string.toLowerCase();
                        if(str.contains("nimrod")){
                        array[j][k][l] = str.replaceAll("nimrod", "pirate ship");
                        }
                    }
                }
            }
        }

    }
}
