package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String[] strings = str.split(" ");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd M yyyy");
            Date birthDay;
            try {
                birthDay = dateFormat.parse(strings[3] + " " + strings[4] + " " + strings[5]);
            } catch (ParseException e) {
                throw new IOException(e);
            }
            return new Person(strings[1], strings[2], strings[0], birthDay);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
