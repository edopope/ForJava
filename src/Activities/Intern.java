package Activities;

import java.util.Scanner;

public class Intern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR FULL NAME:::");
        String name = input.nextLine();

        Transfigure transfigure = new Transfigure();
         String newName = transfigure.capitalise(name);

        System.out.println("Your name is " + newName);
    }
}
