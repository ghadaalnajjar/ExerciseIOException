package org.example;

import java.io.*;
import java.util.ArrayList;

public class WriteFile {

    public static void main(String[] args) {
        ArrayList<String> content = new ArrayList<String>();
        content.add("Hala");
        content.add("Mona");
        content.add("Ilyas");
        content.add("Maha");
        content.add("Salam");
        write(content);
    }

    private static void write( ArrayList<String> content) {
        for (String str: content) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File("WriteFile"+ str +".txt")));
                bw.write(str);
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
