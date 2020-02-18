package Package2;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter radius :");
        float radius;
        radius=myScanner.nextFloat();
        System.out.println(2*3.14*radius);
    }
}
