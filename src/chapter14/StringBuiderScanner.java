package chapter14;

import java.util.Scanner;

public class StringBuiderScanner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a word:");
        String enter = keyboard.nextLine();
        StringBuilder builder = new StringBuilder(enter);
        String reverse = builder.toString();
        if (enter.equals(reverse) ){
            System.out.println("its a palindrome");
        }else if(!enter.equals(reverse) ) {
            System.out.println("its not a palindrome");
        }
        System.out.println(builder.reverse());


    }
}
