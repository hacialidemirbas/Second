package Package2;
import java.util.Scanner;
public class MonthlyPayment {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter MSRP :");
        int MSRP;
        MSRP=myScanner.nextInt();
        System.out.println("Enter Discount :");
        int  myDiscount;
        myDiscount=myScanner.nextInt();
        System.out.println("Enter Month :");
        int myMonth;
        myMonth=myScanner.nextInt();
        System.out.println("Enter Down Payment :");
        int myDownPayment;
        myDownPayment=myScanner.nextInt();
            System.out.println((MSRP*myDiscount-myDownPayment)/myMonth);
    }
}
