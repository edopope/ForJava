package Classes;
import java.lang.Math;

public class Calc {


    public int getSum(int num1,int num2){
        return num1 + num2;
    }
    public int getSubtractNumbers(int a, int b){
        return a - b;
    }

    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public int getDivision(int x, int y) {
        return x / y;
    }

    public double squareOf(int v) {
        return Math.sqrt(v);
    }
}

