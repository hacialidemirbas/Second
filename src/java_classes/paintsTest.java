package java_classes;

public class paintsTest {
    public static void main(String[] args) {
        Paint myPaint= new Paint("zero gravity",2800.00);
        System.out.println(myPaint.toString());
        System.out.println(myPaint.calculatePrice());
        CustomPaint myCustomPaint= new CustomPaint("blue", 3500.00, "durable", "glossy");
        System.out.println(myCustomPaint.calculateCustomPrice());
    }
}

