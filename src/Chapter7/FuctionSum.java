package Chapter7;

public class FuctionSum {
    public int sumOfArray(int...digit){
        int sum = 0;
        for(int numbers = 0; numbers <= digit.length; numbers++){
            sum += numbers;
        }
     return sum;
    }

    public int maxOfArray(int...digit) {
        int max = 9000;
        int m;
        for (m = 0; m <= digit.length; m++) {
            if (m > max) {
                max = m;

            }
        }
        return max;

    }

}
