package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String filename = "C:/Users/High Tech/Desktop/text.txt";

        File file = new File(filename);

        try {
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextInt());

            scanner.nextLine();
            int count = 2;

            while (scanner.hasNext()) {
                System.out.println(count + ": " + scanner.nextLine());
                count++;
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        ExceptionTesting test = new ExceptionTesting();
        try {
            test.exceptionTest();
        } catch (ParseException | IOException e) {
            System.out.println("multi-catch");
        }

        FileReaderDemo fileReaderDemo = new FileReaderDemo();
        System.out.println(fileReaderDemo.toString());
        fileReaderDemo.readFile();


    }
}