package com.company;

import java.io.*;

public class FileReaderDemo {

    @Override
    public String toString() {
        return "some text";
    }

    public void readFile() {

        File file = new File("test.txt");

        //FileReader fileReader;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

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
        /*finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                //file not opened
            }
            System.out.println("making sure that finally is working");
        */

    }

}
