package chapter15;

import jdk.jfr.StackTrace;

import java.io.IOException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
       try{
           Formatter formatter = new Formatter("grace.txt");
           Scanner keyboard = new Scanner(System.in);
           System.out.println("Enter a first name and a last name::");
           while (keyboard.hasNext()){
               try{
                   formatter.format("%s %s",
                           keyboard.next(), keyboard.next());

               }catch (NoSuchElementException noSuchElementException){
                   System.err.println("Enter the first name and last name again:");
                   keyboard.nextLine();
               }
           }
       }catch (IOException ioException){
           ioException.printStackTrace();
       }
    }
}
