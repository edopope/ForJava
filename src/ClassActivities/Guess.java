package ClassActivities;

import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gameNumber = 36;

        for(int timesEntered = 0; timesEntered < 3; timesEntered++) {
            System.out.print("enter game number ");
            int guessNumber = input.nextInt();

            if (guessNumber > gameNumber) {
                System.out.println("too high");
            }
            if (guessNumber < gameNumber) {
                System.out.println("too low");
            }
            if (guessNumber == gameNumber) {
                System.out.println("you are a genius");
            break;

            }


        }
    }
}
