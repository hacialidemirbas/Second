package MD_February2nd;
import java.util.Scanner;
public class CirclePerimeterInput {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        float radius;
        System.out.print("Please enter the radius : ");
        radius = myScan.nextFloat();
        System.out.println("The perimeter of this circle is : "+(2*3.14*radius));
        System.out.format("Perimeter with fractional part : %.1f\n",2*3.14*radius);
        System.out.format("Perimeter with 3 fractional part : %.3f\n",2*3.14*radius);
        System.out.format("Perimeter with 2 fractional part : %.2f\n",2*3.14*radius);
    }
}
