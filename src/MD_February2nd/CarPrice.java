package MD_February2nd;
import java.util.Scanner;
public class CarPrice {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int MSRP;
            MSRP = scanner.nextInt();
            float discount = scanner.nextInt();
            int months = scanner.nextInt();
            double monthlyPayment = (MSRP*((100-discount)/100))/months;
            System.out.println("Monthly payment is : " + monthlyPayment);
    }
}
