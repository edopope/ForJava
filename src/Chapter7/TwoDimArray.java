package Chapter7;

public class TwoDimArray {
    public static void main(String[] args) {
//        String[] schoolNames = {"covenant", "wisdom", "progress"};
//        for (int i = schoolNames.length - 1; i >= 0; i--) {
//
//
//            System.out.println(schoolNames[i]);
//
//        }
//
//
//        }
//    }
        int total = 0;
        for (int x = 2; x <= 20; x+= 2) {
            total += x;
            System.out.printf("the sum is %d%n", total);
        }

    }
}