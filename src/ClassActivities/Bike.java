package ClassActivities;

public class Bike {
    private boolean bikeOn;
    private boolean bikeOff;
    private int acceleration;



    public void setBikeOn() {
        if (bikeOn == false) {
            bikeOn = true;
        }
    }
        public boolean getBikeOn() {
            return bikeOn;
        }

    public void setBikeOff() {
        if(bikeOff == true) {
            bikeOff = false;
        }
    }
    public boolean getBikeOff() {
        return bikeOff;

    }
    public void setAcceleration(int gear) {

    }
}


