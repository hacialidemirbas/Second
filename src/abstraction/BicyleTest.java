package abstraction;

public class BicyleTest {
    public static void main(String[] args) {
        MountainBike myBike= new MountainBike("Tubeless", 26);
        myBike.slowDown();
        myBike.speedUp();
        myBike.start();
        myBike.stop();
        myBike.switchToSteepMode();
        System.out.println(myBike.toString());
    }
}
