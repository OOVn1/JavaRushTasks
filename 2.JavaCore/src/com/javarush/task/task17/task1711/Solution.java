package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = null;
        switch (args[0]) {
            case "-c": {
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equalsIgnoreCase("М")) {
                            person = Person.createMale(args[i], input.parse(args[i + 2]));
                        } else if (args[i + 1].equalsIgnoreCase("Ж")) {
                            person = Person.createFemale(args[i], input.parse(args[i + 2]));
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;
            }
            case "-u": {
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 & id < allPeople.size() & (person = allPeople.get(id)) != null) {
                            person.setName(args[i + 1]);
                            if (args[i + 2].equalsIgnoreCase("M")) {
                                person.setSex(Sex.MALE);
                            } else if (args[i + 2].equalsIgnoreCase("Ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(input.parse(args[i + 3]));
                        }
                    }
                }
                break;
            }
            case "-d": {
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if(id >= 0 && id < allPeople.size() && (person = allPeople.get(id))!= null){
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                }
                break;
            }
            case "-i": {
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if(id >= 0 && id < allPeople.size() && (person = allPeople.get(id))!= null){
                            String sex = null;
                            if(person.getSex().equals(Sex.MALE)){
                                sex = "м";
                            }else {
                                sex = "ж";
                            }
                            System.out.println(person.getName() + " " + sex + " " + output.format(person.getBirthDate()));
                        }
                    }
                }
                break;
            }
        }
        allPeople.forEach(System.out::println);
    }
}