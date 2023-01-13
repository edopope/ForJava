package Activities;
import java.util.Scanner;

public class ReverseArray {
    public  int reverseArray(int[] array) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == number) {
                number = array[i];
            }

        }
        return array[number];
    }


    public static void main(String[] args) {
        ReverseArray back = new ReverseArray();
       int [] numbers = {1,2,3,4,5};
        System.out.println(back.reverseArray(numbers));
    }
}







