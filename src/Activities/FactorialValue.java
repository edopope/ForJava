package Activities;

import java.util.Scanner;
public class FactorialValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int factor = input.nextInt();
        int number = factor;

        for (int a = 1; a <= number; a++ ) {
            if (number % a == 0){
                System.out.print(a + " ");
            }

        }
    }
}