package creating_classes;

public class CarTest {
    public static void main(String[] args) {
        Car camry= new Car(2016, 3000, "Camry");
        System.out.println("Model : \t"+camry.modelName+
                "\nYear : \t\t"+camry.modelYear+
                "\n Engine : \t"+camry.engineVolume);
    }

}
