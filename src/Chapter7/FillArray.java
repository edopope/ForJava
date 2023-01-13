package Chapter7;

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int [] arrays = new int[10];
        for(int x = 1; x<= 10; x++){
            arrays[x-1] = x;
            System.out.printf("%d",arrays[x-1]);
            System.out.print(",");
        }

        char [] tic = {'x', 'o', 'x'}; 

    }
}
