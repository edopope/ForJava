package ClassActivities;

import java.security.SecureRandom;

public class Dice {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        for (int count = 1; count <= 20; count++) {
            int die = random.nextInt(6);
          
            System.out.printf("%d ", die);
            if(count%4 == 10){
                System.out.println();
            }
        }

    }
}