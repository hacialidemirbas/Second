package Package8F;
import java.util.Scanner;
public class CharComparison {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter C for Cirle, R for Rectangle, T for Triangle");
        String myShape = myScan.next();
        if (myShape.compareToIgnoreCase("C") == 0) {//for the circle
            //ask radius  from user
            System.out.println("Please enter radius");
            Double myRadius = myScan.nextDouble();
            System.out.println(2*3.14*myRadius);
        } else if (myShape.compareToIgnoreCase("R") == 0) {//for the rectangle
            // ask user for base and height
            System.out.println("Please enter base and height of rectangle");
            int myBase = myScan.nextInt();
            int myHeight=myScan.nextInt();
            System.out.println(myBase*myHeight);
        } else if (myShape.compareToIgnoreCase("T") == 0) {
            System.out.println("Please enter the edges of the triangle");
            int edge1 = myScan.nextInt();
            int edge2=myScan.nextInt();
            int edge3=myScan.nextInt();
            System.out.println(edge1+edge2+edge3);
        } else {
            System.out.println("Please C,R, T only");

        }
    }
}