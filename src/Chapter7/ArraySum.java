package Chapter7;

public class ArraySum {
    public static void main(String[] args) {
        int [] num = {2,3,56,7,5,4,3,2,5,9};
        int sum = 0;
for(int count = 0; count< num.length; count++) {
    sum += num[count];
}
    System.out.printf("your sum is--->%d", sum  );


    }
}
