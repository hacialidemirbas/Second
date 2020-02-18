package Package9F;
import java.util.Scanner;
public class Computer {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Size? (S/M/L) :");
        String size = myScanner.next();
        System.out.println("Member? Y/N");
        String member= myScanner.next();
        if (member.equalsIgnoreCase("N")){
            System.out.println("PLease sign up; for membership");
        }
        if(size.equals("S")||size.equals("s")){
            System.out.println("$9.99");

        }
        else if (size.equals("M")||size.equals("m")){
            System.out.println("$10.99");
        }
        else if (size.compareToIgnoreCase("L")==0) {
            System.out.println("$11.99");
        }
        else {
            System.out.println("Sorry onlyS/M/L");
        }
    }
}
