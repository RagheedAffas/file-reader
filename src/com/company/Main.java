package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{

       String filename = "C:/Users/High Tech/Desktop/text.txt";


        File file = new File(filename);

        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextInt());

        scanner.nextLine();

        int count = 2;

        while (scanner.hasNext()) {

            System.out.println(count + ": " + scanner.nextLine());

            count++;

        }

        scanner.close();

    }
}