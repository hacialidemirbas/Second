package Exercises;

public class Car2 {
    String color;
    String type;
    Car2(String year, String model){
        System.out.println("The car is a " + color + " " + type);
    }

    public static void main(String[] args) {
        Car2 myCar2= new Car2("silver", "sedan");

    }
}
