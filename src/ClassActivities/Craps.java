package ClassActivities;
 import java.security.SecureRandom;

public class Craps {
    public int sum;
    private int myPoint;
    public status gameStatus;

    public enum status {CONTINUE, WON, LOSE}

    private final SecureRandom randomNumber = new SecureRandom();

    public void rollDice() {
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);
        sum = die1 + die2;
    }
    public status getGameStatus() {
        switch(sum) {
            case 7,11 -> gameStatus = status.WON;
            case 2,3,12 -> gameStatus = status.LOSE;
            default -> {
                gameStatus = status.CONTINUE;
                myPoint = sum;
            }
        }
        return gameStatus;
    }
    public int getMyPoint() {
        return myPoint;
    }
}
