package creating_classes;

public class carMaintenanceTest {
        public static void main(String[] args) {
            carMaintenance myCar = new carMaintenance("Toyota",65000,70000,"new","new","old");
            System.out.println(myCar.toString());
            myCar.displayFilterStatus();
            myCar.doOilChange();
            myCar.setAirFilterStatus("old");
            myCar.doOilChange();
            System.out.println(myCar.getOdometerNextOilChange());
            System.out.println(myCar.toString());
            myCar.doOilChange();
            myCar.doOilChange();
            System.out.println(myCar.toString());
        }

}
