package com.javarush.task.jdk13.task35.task3509;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Wildcards для коллекций
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static Double sum(List<? extends Number> list) {
        Double result = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = (Number) list.get(i);
            result += numb.doubleValue();
        }
        return result;
    }

    public static Double multiply(List<? extends Number> list) {
        Double result = 1.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = (Number) list.get(i);
            result *= numb.doubleValue();
        }
        return result;
    }

    public static String concat(List<?> list) {
        StringBuilder builder = new StringBuilder();
        for (Object obj : list) {
            builder.append(obj);
        }
        return builder.toString();
    }

    public static <T> List<T> combine(List<? extends Collection<T>> list) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Collection<T> collection = list.get(i);
            result.addAll(collection);
        }
        return result;
    }
}
