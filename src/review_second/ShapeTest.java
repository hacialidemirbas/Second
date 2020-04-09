package review_second;

public class ShapeTest {
    public static void main(String[] args) {
        Shape.calculatePerimeter(4);
        Shape.calculatePerimeter(3, 5, 4);
        Shape.calculatePerimeter(6);
        Shape myShape= new Shape();
        myShape.calculateArea(3, 5);
        myShape.calculateArea(6);
        myShape.calculateArea(4);
    }
}
