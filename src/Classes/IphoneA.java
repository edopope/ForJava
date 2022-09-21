package Classes;

import java.util.Scanner;
public class IphoneA {
  public static void main(String[] args) {
        Iphone Iphone14 = new Iphone();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the color of the phone");
        String color = input.nextLine();
        Iphone14.setColor(color);
        System.out.printf("your iphone colour is %s%n", Iphone14.getColor());



        Iphone14.setPrice(170000);
        System.out.printf("your Classes.Iphone price is %d", Iphone14.getPrice());
    }

}
