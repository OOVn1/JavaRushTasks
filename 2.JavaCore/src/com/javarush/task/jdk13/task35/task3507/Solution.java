package com.javarush.task.jdk13.task35.task3507;

import java.util.*;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T elements) {
        return new ArrayList<T>(Collections.singletonList(elements));
    }

    public static <T> HashSet<T> newHashSet(T elements) {
        return new HashSet<T>(List.of(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        HashMap<K, V> kvHashMap = new HashMap<>();
        if(keys.size() != values.size()){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < keys.size(); i++) {
            kvHashMap.put(keys.get(i), values.get(i));
        }
        return kvHashMap;
    }
}

