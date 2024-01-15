package com.javarush.task.task26.task2601;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
        Integer[] array = {13, 8, 15, 5, 17};
        Integer[] sort = sort(array);
        //System.out.println(Arrays.toString(sort));
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        final int mediana;
        if(array.length % 2 != 0){
            mediana = array[array.length / 2];
        }else {
            mediana = (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
        }
        Comparator<Integer> comparator = Comparator.comparingInt(o -> Math.abs(mediana - o));
        Arrays.sort(array, comparator);
        return array;
    }
}
