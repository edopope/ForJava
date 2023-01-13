package Chapter7;
import java.security.SecureRandom;
public class LoopDice {
    public static void main(String[] args) {
        SecureRandom randy = new SecureRandom();
        for(int counter = 1; counter <= 60; counter++) {
            int side = 1 + randy.nextInt(6);
            System.out.printf("%d",side);

            if (counter % 12 == 0) {
                System.out.println( ",");
            }

        }
        //System.out.println(Math.pow(445,33));
    }
}
