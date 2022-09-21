package tdd;

import ClassActivities.Air;
import org.junit.jupiter.api.Test;



public class AirConditionerTest {
    @Test
    public void conditionerTest(){

        //  first I have an AC
        Air AirConditionerTest = new Air();
        //It has to be ON
        boolean Ac = true;
        if(Ac == true){
            System.out.println("ON");
        }
        else{
            System.out.println("OFF");
        }




    }
}
