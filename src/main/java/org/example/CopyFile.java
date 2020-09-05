package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CopyFile {

    public static void main(String[] args) {
        File source = new File("readString.txt");
        File destination = new File("Copy-readString.txt");
        copy(source, destination);
    }

    private static void copy(File source, File destination) {
        try {
            BufferedInputStream input = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(destination));
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead = input.read(buffer)) > 0) {
                output.write(buffer, 0, byteRead);
                output.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
