package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        try (FileOutputStream fileOutput = new FileOutputStream("MyFileName2.txt");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
             FileInputStream fileInput = new FileInputStream("MyFileName2.txt");
             ObjectInputStream inputStream = new ObjectInputStream(fileInput)) {
            Solution solution = new Solution("myFileName.txt");
            solution.writeObject("Hello");

            outputStream.writeObject(solution);
            outputStream.flush();

            Solution lodeSolution = (Solution) inputStream.readObject();
            lodeSolution.writeObject("HelloWorld");

        }
    }
}
