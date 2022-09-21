package ClassActivities;

import java.util.Scanner;
public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter =1;
        while (gradeCounter <= 3) {
            System.out.print("enter grade __");
            int grade = input.nextInt();

            total = total + grade;
            gradeCounter = gradeCounter + 1;


            int Average = total / 10;
            System.out.printf("the class average is %d%n", Average);
            System.out.printf("the total is %d%n", total);


        }


        }




    }

