package tdd;

import ClassActivities.Air;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirTest {
    @Test
    public void switchAcOn() {
       // first I have an Ac
        Air myAirConditioner = new Air();
        // When I switch on ac
        myAirConditioner.setTurnOn();
        // check if AirCondition is on
        boolean turnOn = myAirConditioner.getTurnOn();
        assertTrue(turnOn);

    }
    @Test
    public void turnOffAirConditioner() {
        // i have an AC
        Air myAirConditioner = new Air();
        // when I turn on AC
        myAirConditioner.setTurnOff();
        //check if Its off
        boolean turnOff = myAirConditioner.getTurnOff();
        assertFalse(turnOff);
    }
    @Test
    public void setTemperature() {
        Air myAirConditioner = new Air();
        myAirConditioner.getTurnOn();
        myAirConditioner.setTemperature(16);
        assertEquals(16, myAirConditioner.getTemperature());
    }
    @Test
    public void getTemperature() {
        Air myAirConditioner = new Air();
        myAirConditioner.getTurnOn();
        myAirConditioner.setTemperature(30);
        myAirConditioner.decreaseTemperature(20);
        assertEquals(24, myAirConditioner.getTemperature());
    }



}