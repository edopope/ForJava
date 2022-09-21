package Activities;
import java.util.Scanner;
public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER---->>");
        int num = input.nextInt();
        int square = num * num;

        if(square > 100) {
            System.out.printf("%d IS GREATER THAN 100%n", square);
        }
            else {
                System.out.printf("%d is not greater than 100%n", square);
            }
            if(square == 100 ){
                System.out.printf("%d IS EQUAL TO 100%n", square);
            }
            else{
                System.out.printf("%d IS NOT EQUAL TO 100%n",square);
            }


            if(square < 100){
                System.out.printf("%d IS LESS THAN 100 %n", square);
            }
        }
    }
