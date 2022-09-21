package ClassActivities;

public class Air {
    private boolean turnOn;
    private boolean turnOff;
    private int temperature;

    public void setTurnOn() {
        if(turnOn == false) {
            turnOn = true;

        }
    }
    public boolean getTurnOn() {
        return turnOn;

    }
    public void setTurnOff() {
        if(turnOff == true) {
            turnOff = false;
        }
    }
    public boolean getTurnOff() {
        return turnOff;
    }
    public void setTemperature(int temp) {
        if(temperature >= 16) {
            if(temperature <= 30)
                temperature = temp;
        }
    }
    public int getTemperature(){
        return temperature;
    }
    public void decreaseTemperature(int temp){
        temperature = temperature - temp;
    if(temperature < 16) {
        temperature = 16;
    }

    }


}

