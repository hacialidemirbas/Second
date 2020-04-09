package Interface;

public class LaptopTest {
    public static void main(String[] args) {
        Laptop myLaptop= new Laptop("IntelMaxxx", 64, 5500, "Intel 2020", 75);
        myLaptop.ChargeBattery();
        myLaptop.showBatteryPercentage();
    }
}
