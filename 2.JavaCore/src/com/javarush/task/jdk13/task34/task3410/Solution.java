package com.javarush.task.jdk13.task34.task3410;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* 
Обнуление объекта
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User(28219, "Paulo", 40, 9999, "paulo@javarush.com");
        System.out.println(user);
        reset(user);
        System.out.println(user);
    }

    public static void reset(Object object) throws Exception {
        Arrays.stream(object.getClass().getDeclaredFields()).filter(field -> Modifier.isPrivate(field.getModifiers()))
                .filter(field -> !Modifier.isStatic(field.getModifiers())).filter(field -> !field.getType().isPrimitive())
                .peek(field -> field.setAccessible(true)).forEach(field -> {
                    try {
                        field.set(object, null);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
    public static void reset1(Object object) throws Exception {
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (Modifier.isPrivate(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                field.setAccessible(true);
                field.set(object, null);
            }
        }
    }
}
