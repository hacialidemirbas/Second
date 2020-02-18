package Package4;
import java.util.Scanner;
public class InputTriangle {
    public static void main(String[] args) {
        System.out.println("Please enter three integer numbers");
        Scanner myScanner= new Scanner(System.in);
        int edge1 = myScanner.nextInt();
        int edge2= myScanner.nextInt();
        int edge3=myScanner.nextInt();
        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2)
        {
            System.out.println("Can form a TRIANGLE");
        }

             else   {
            System.out.println("Can not form a TRIANGLE");
        }

    }
}
