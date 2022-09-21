package Activities;

import ClassActivities.MathsM;

import  java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        MathsM maths = new MathsM();
        Scanner input = new Scanner(System.in);
            System.out.printf("enter 2 number:%n");
            int num = input.nextInt();
            int num1 = input.nextInt();
            int result = maths.Square(num);
            int result2 = maths.Square(num1);
            System.out.printf("the result is, %d%n and %d%n", result, result2);
 int sum = result + result2;
        System.out.printf("THE SUM OF THE TWO NUMBERS IS--> %d%n", sum);
        int subtract = result - result2;
        System.out.printf("THE DIFFERENCE OF THE TWO NUMBERS ARE %d%n", subtract);

        }
    }
