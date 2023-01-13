package Activities;

import ClassActivities.MathsM;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {
    @Test
    public void testForSquareOfNumbers(){
        MathsM math = new MathsM();
        Assertions.assertEquals(36, math.Square(6));
    }
    @Test
    public void testForSumOfSquare(){
        MathsM math = new MathsM();
        Assertions.assertEquals(72, math.sumOfSquare(6,6));
    }
    @Test
    public void testForSubtractSquare(){
        MathsM math= new MathsM();
        Assertions.assertEquals(0, math.subtractOfSquare(6,6));
    }

    }

