package JavaReview;

public class Test {
    public static int add(int a, int b){
        return a+b;

    }
    public static double add(double a, double b){
return a+b;
    }

    public static void main(String[] args) {
        System.out.println(Test.add(3,5));
        System.out.println(Test.add(3.0, 5.0));
    }
}
