package Chapter7;

public class Exercise {
    public static void main(String[] args) {
        String[] namesStartingWithR = {"richy", "rabiu", "rashida", "rent", "rashford", "ratty", "rolex", "rapheal", "rae", "ray"};
        System.out.println(namesStartingWithR[9]);
        int[] numbers = {2, 2, 2, 2, 3, 4, 5, 6, 44, 45, 5, 3, 2, 34, 5, 4, 3, 333, 4, 5, 3, 3, 33, 4, 5, 55, 33, 3, 4, 4, 5, 67, 8, 9986,};
        int maxi = numbers[0];
        for (int x : numbers) {
            if (x > maxi) ;
            maxi = x;
        }
        System.out.printf("maximum number is ::%d", +maxi);

        int[] negativeDigit = new int[6];
        for (int x = 0; x < negativeDigit.length; x++){
            negativeDigit[x]= -1;
            System.out.println(negativeDigit[x]);
        }
    }
}