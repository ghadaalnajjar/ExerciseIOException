package org.example;


import java.io.*;
import java.io.FileReader;


public class ReadFileString {
    public static void main (String[] args) {
        File source = new File("readString.txt");

        String result = read(source);
        System.out.println("result = " + result);
    }

    private static String read(File source){
        try {
            FileReader fileReader = new FileReader(source);
            String str = "";
            int i;
            while ((i = fileReader.read()) != -1) {
                char letter = (char) i;
                str += letter;
            }
            return str;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";

    }

}
