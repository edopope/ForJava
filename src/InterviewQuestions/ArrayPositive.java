package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPositive {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int [] myNumbers = new int [10];
        int count = 0;
        for (int i = 0; i <10 ; i++) {
        System.out.println("Enter a number:::");
          int newNumber = keyboard.nextInt();
          myNumbers[count++] = newNumber;
        }



    }
}




