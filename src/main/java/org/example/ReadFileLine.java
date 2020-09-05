package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileLine {
    public static void main (String[] args) {
        File source = new File("readline.txt");
        read(source).forEach(System.out::println);
    }

    public static List<String> read (File source) {
        List<String> List = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                List.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List;
    }
}
