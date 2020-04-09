package review_second;

public class Shape {
    int height;
    int base;
    public static void calculatePerimeter(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void calculatePerimeter(int a){
        System.out.println(4*a);
    }
    public static void calculatePerimeter(double r){
        System.out.println(2*3.14*r);
    }
    public void calculateArea(int width, int length){
        System.out.println(width*length);
    }
    public void calculateArea(int width){
        System.out.println(width*width);
    }
    public void calculateArea(double r){
        System.out.println(3.14*r*r);
    }
}
