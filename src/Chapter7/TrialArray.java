package Chapter7;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class TrialArray {
    public static void main(String[] args) {
        String [] names = {"john","felix","ifeanyi","joan"};
        int [] numbers = {12,1,222,333,455,677};
        try{
            System.out.printf("%s%n%d",names[7],numbers[2]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("input a valid number within range");
        }
        System.out.printf( "%s%n%d%n",names[3],numbers[2]);
        Date date = new Date();
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek());
        LocalTime time = LocalTime.now();
        System.out.println(time);
        }
    }

