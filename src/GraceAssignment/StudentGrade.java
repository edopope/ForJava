package GraceAssignment;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Acounter = 0;
        int Bcounter = 0;
        int Ccounter = 0;
        int Dcounter = 0;
        System.out.print("Enter student name:");
        String name = input.nextLine();
        System.out.print("enter student grades:");
        String grade = input.nextLine();
        for (int gradeCounter = 0; gradeCounter >= 5; gradeCounter++) {
            System.out.printf("the student grades are" +
                    "student1:", Acounter,
                    "student2:", Bcounter);

        }



    }
}