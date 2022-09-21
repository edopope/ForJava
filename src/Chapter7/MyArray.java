package Chapter7;

public class MyArray {
    public static void main(String[] args) {
        int[] box = new int[4];
        box [0] = 4;
        box [1] = 3;
        box [2] = 2;
        box [3] = 7;
        int result = box[0]+ box[2];
        System.out.println("the result is: " +result);



        String[] school = {"semicolon","college","blue college"};
        for(int a = 0; a<= school.length; a++) {
            System.out.println(school[a]);
        }

    }
}
