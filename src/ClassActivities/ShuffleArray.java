package ClassActivities;

import java.security.SecureRandom;
import java.util.Arrays;

public class ShuffleArray {
    public static SecureRandom ran = new SecureRandom();
    public static int [] digit(int[]arrays) {
        for (int swap1 = 0; swap1 < arrays.length; swap1++) {
            int i = ran.nextInt(arrays.length);
            int j = ran.nextInt(arrays.length);
            int temp = arrays[i];
            arrays[i] = arrays[j];
            arrays[j] = temp;
            //arrays[swap1] += 1+ ran.nextInt(10);


        }
        return arrays;

    }
        public static int [] ReverseSort(int[] age){
            for (int i = 0; i < age.length ; i++) {
                for (int j = i+1; j < age.length ; j++) {
                    if(age[i] < age[j]){
                        int temp = age[i];
                        age[i] = age[j];
                        age[j] = temp;
                    }

                }

            }
            return age;
        }

    public static void main(String[] args) {
        int [] age = {12,34,56,78,65,43,23};
        System.out.println(Arrays.toString(digit(age)));
        System.out.println(Arrays.toString(ReverseSort(age) ));
    }

}
