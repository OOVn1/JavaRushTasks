package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main1(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            SimpleDateFormat format = new SimpleDateFormat("dd M yyyy");
            while (reader.ready()) {
                String str = reader.readLine();
                String[] words = str.split(" ");
                StringBuilder name = new StringBuilder(words[0]);
                if (words.length > 4) {
                    for (int i = 1; i < words.length - 3; i++) {
                        name.append(" ").append(words[i]);
                    }
                }
                String date = words[words.length - 3] + " " + words[words.length - 2] + " " + words[words.length - 1];
                Person person = new Person(name.toString(), format.parse(date));
                PEOPLE.add(person);
            }
        }
        for (Person person : PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthDate());
        }
    }

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            SimpleDateFormat format = new SimpleDateFormat("dd M yyyy");
            while (reader.ready()) {
                String str = reader.readLine();
                String name = str.replaceAll("\\d", "").trim();
                String date = str.replaceAll("\\D", " ").trim();
                PEOPLE.add(new Person(name, format.parse(date)));
            }
        }
        for (Person person : PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthDate());
        }
    }
}
