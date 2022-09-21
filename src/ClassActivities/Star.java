package ClassActivities;

import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter display number");
            int star = input.nextInt();

            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            int e = 5;
            if (a == 1) {
                System.out.println("*");
            }
            if (b == 2) {
                System.out.println("**");
            }
            if (c ==3){
                System.out.println("***");
            }
            if (d==4) {
                System.out.println("****");
            }
            if(e==5) {
                System.out.print("*****");

            }
        }
    }
