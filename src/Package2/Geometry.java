package Package2;
import java.util.Scanner;
public class Geometry {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter height :");
        int height, width;
        height=myScanner.nextInt();
        System.out.println("Enter width :");
        width=myScanner.nextInt();
        System.out.println(height*width);
    }
}
