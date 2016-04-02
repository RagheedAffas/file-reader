package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{

        String filename = "C:/Users/High Tech/Desktop/text.txt";


        File file = new File(filename);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {

            System.out.println(scanner.nextLine());

        }

    }
}
