package Chapter8;

import java.util.Arrays;

public class HugeIntegerDriver {
    public static void main(String[] args) {
        HugeInteger myInteger = new HugeInteger();
        int [] score = {9,6,9,9,9};
        int [] score1 = {9,9,9,9,9};
        System.out.println(Arrays.toString(myInteger.add(score, score1)));
        System.out.println(Arrays.toString(myInteger.subtract(score, score1)));
        System.out.println(myInteger.isGreaterThan(score,score1));
        System.out.println(myInteger.isLessThan(score,score1));
        System.out.println(myInteger.isEqualsTo(score,score1));
        System.out.println(myInteger.isNotEqualsTo(score,score1));
    }
}
