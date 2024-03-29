package com.javarush.task.jdk13.task38.task3802;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ticket {

    Priority priority() default Priority.MEDIUM;

    String createdBy() default "Amigo";

    String[] tags() default {};

    enum Priority{
        LOW, MEDIUM, HIGH
    }
}
