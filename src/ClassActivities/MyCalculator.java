package ClassActivities;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter a number");
            int a = input.nextInt();
            System.out.println("enter a second number");
            int b = input.nextInt();
            System.out.println("press 1 for addition");
            System.out.println("press 2 for subtraction");
            System.out.println("press 3 for division");
            System.out.println("press 4 for multiplication");
            System.out.println("press 99 to exit");
            int c = input.nextInt();
            switch (c) {
                case 1:
                    int add = a + b;
                    System.out.printf("RESULT --> %d%n", add);
                case 2:
                    int sub = a - b;
                    System.out.printf("RESULT IS --> %d%n", sub);
                    break;
                case 3:
                    int divide = a / b;
                    System.out.printf("RESULT --> %d%n", divide);
                    break;
                case 4:
                    int multi = a * b;
                    System.out.printf("RESULT --> %d%n", multi);
                    break;
            }
                    if(c == 99){
                        break;
                    }




        }
    }
}