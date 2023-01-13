package Chapter7;

import java.util.Arrays;

public class ArrayCounter {
    public static void main(String[] args) {
        int array[] ={100,40,80,60,89,46,78,90,90,98,87,};
        String [] colour = {"red","blue","yellow","orange","purple","green"};
        Arrays.stream(colour).forEach(System.out::println);
        int total = 0;
        for(int counter = 0; counter < array.length; counter++){
            total += array[counter];
            System.out.printf("your array total is %d%n", total);

        }
    }
}
