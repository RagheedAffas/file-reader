package com.company;

import java.io.*;

public class FileReaderDemo {

    @Override
    public String toString() {
        return "some text";
    }

    public void readFile() {

        File file = new File("test.txt");

        FileReader fileReader;

        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);

            String line;

            //line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + file.toString() + " is missing");
        } catch (IOException e) {
            System.out.println("File " + file.toString() + " can't be opened");
        }
        //finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException scsc) {
                //file not opened
            }
            System.out.println("making sure that finally is working");


    }

}
