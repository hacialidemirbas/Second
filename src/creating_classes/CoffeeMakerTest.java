package creating_classes;

public class CoffeeMakerTest {
    public static void main(String[] args) {
        CoffeeMaker JuanValdez= new CoffeeMaker(6);
        System.out.println(JuanValdez.toString());
        JuanValdez.setTimer(20);
        System.out.println(JuanValdez.getTimer());
        JuanValdez.resetTimer();
        JuanValdez.brewCoffee();

    }
}
