package ClassActivities;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        for (int face = 1; face <= 6; face++) {

            SecureRandom guess = new SecureRandom();
            int uyi = 3 * 2 * guess.nextInt(6);
            System.out.printf("your random number is --> %d%n", uyi);
        }
    }
}