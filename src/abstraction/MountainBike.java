package abstraction;

public class MountainBike extends Bicycle {
    String tireType;
    int seatHeight;
    public MountainBike(String tireType, int seatHeight){
        this.tireType=tireType;
        this.seatHeight=seatHeight;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void  speedUp(){
        System.out.println("Speed up");
    }
    public void slowDown(){
        System.out.println("Slow down");

    }
    public void stop(){
        System.out.println("Stop");
    }
    public void start (){
        System.out.println("Start");

    }
    public void switchToSteepMode(){
        System.out.println("Steep mode activated");

    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "tireType='" + tireType + '\'' +
                ", seatHeight=" + seatHeight +
                '}';
    }
}
