package ChibuzoAssignment;

public class EvenLoop {
    public static void jumpLoop(int[] num) {
        int counter = 0;
        for ( counter = 0; counter < num.length; counter++) {
            if (counter % 2 ==   0) {
                System.out.print(num[counter] + " ");

            }

        }

    }



    public static void main(String[] args) {
        int [] score = {1,3,5,7,9,11,13,15,17};
        jumpLoop(score);
    }
}

