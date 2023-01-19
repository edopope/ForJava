package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        byte [] bytes = new byte[40];
        try {
            FileInputStream stream = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\colonJava\\src\\chapter15\\test.txt");
            stream.read(bytes);
            for (byte b:bytes) {
                System.out.print(Character.toString(b));
            }

        }catch(IOException files){
            System.out.println(files.getMessage());
        }
    }
}