package Package2;
import java.util.Scanner;
public class TriangelPerimeter {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter edge 1 :");
        int edge1, edge2, edge3;
        edge1=myScanner.nextInt();
        System.out.println("Enter edge 2 :");
        edge2=myScanner.nextInt();
        System.out.println("Enter edge 3 :");
        edge3=myScanner.nextInt();
        System.out.println(edge1+edge2+edge3);

    }
}
