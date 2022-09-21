package ClassActivities;

import java.util.Scanner;
public class GameBoy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guessNumber = 23;
        for(int numberOfTimes = 0; numberOfTimes < 3 ; numberOfTimes++) {
            System.out.print("enter game number");
            int gameNumber = input.nextInt();

            if (guessNumber == gameNumber) {
                System.out.println("you are correct");
                break;

            }
            if (gameNumber < guessNumber) {
                System.out.println("too low");
            }
            if (gameNumber > guessNumber) {
                System.out.println("too high");
            }
        }

    }
}