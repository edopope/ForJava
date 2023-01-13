package chapter15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(Paths.get("grace.txt"))){
            System.out.printf("%12s%10s%n",
                    "First Name", "Last Name");



            while (input.hasNext()) {
                System.out.printf("%12s%12s",
                        input.next(), input.next());
            }


        } catch (IOException | NoSuchElementException |
                 IllegalStateException e) {
            e.printStackTrace();
        }
    }
}