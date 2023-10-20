package com.javarush.task.jdk13.task34.task3407;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* 
Собиратель типов
*/

public class Solution {

    private Map<TimeUnit, BiFunction<Integer, Long, Map<Boolean, List<String>>>> field;

    public static void main(String[] args) throws Exception {
        getTypes(Solution.class.getDeclaredField("field").getGenericType()).forEach(System.out::println);
    }

    public static Set<Type> getTypes(Type type) {
        Set<Type> set = new LinkedHashSet<>();
        if(type instanceof ParameterizedType parameterizedType){
            set.add(parameterizedType.getRawType());
 //           Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
 //           for (Type actual : actualTypeArguments){
  //              Set<Type> types = getTypes(actual);
  //              set.addAll(types);
          //  }
            Arrays.stream(parameterizedType.getActualTypeArguments()).map(actual -> getTypes(actual)).forEach(types -> set.addAll(types));
        }else {
            set.add(type);
        }
        return set;
    }
}
