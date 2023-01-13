package HackerRank;

import java.security.SecureRandom;
import java.util.Random;

public class ArrayRadom {
    public static void main(String[] args) {
        SecureRandom ran = new SecureRandom();
        int[] scores = new int[20];
        int rows;
        for (rows = 0; rows < scores.length; rows++) {
            scores[rows] += 1 + ran.nextInt(20);
            System.out.println();
        }

    }

}