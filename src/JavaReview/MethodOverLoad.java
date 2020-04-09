package JavaReview;

public class MethodOverLoad {
    public int sum(int a, int b)
    {
        return a+b;
    }
    public int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public double sum(double a, double b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverLoad object = new MethodOverLoad();
        System.out.println(object.sum(15, 10));
        System.out.println(object.sum(2.55, 3.75));
        System.out.println(object.sum(3, 5, 7));
    }
}
