package creating_classes;

public class Calculator {
    public static void main(String[] args) {
        myCalculator(400, 50);

    }
    public static void myCalculator(int a, int b){
        System.out.println("Addition= "+(a+b));
        System.out.println("Subtraction= "+(a-b));
        System.out.println("Multiplication= "+(a*b));
        System.out.println("Division ="+(a/b));


    }
}
