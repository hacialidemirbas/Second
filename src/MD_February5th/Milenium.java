package MD_February5th;
import java.util.Scanner;
public class Milenium {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print(" Please enter a year : ");
        int year = myScanner.nextInt();
        if(year>=2000){
            System.out.println("After Milenium");
        }
        else {
            System.out.println("Before milenium");
        }
    }
}
