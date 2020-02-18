package PackageFebruary12;
import java.util.Scanner;
public class NestedLoop2User {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 'i' value   :   ");
        int myStart = myScanner.nextInt();
        System.out.println("Please enter end value:    ");
        int myEnd = myScanner.nextInt();
        System.out.println("Enter what you want to print");
        String myPrint = myScanner.next();
        for (int i = myStart; i < myEnd; i++) {
            for (int j = myEnd; i < myEnd; j++) {
                System.out.println(i);
                System.out.println(i);
            }


        }
    }
}
