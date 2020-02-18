package MD_February9th;
import java.util.Scanner;
public class InternetBill {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Subscribed? (Y/N)");
        String member = myScanner.next();

        if(member.equalsIgnoreCase("Y")){
            //ask usage
            System.out.print("Enter usage please (1-100) : ");
            int usage = myScanner.nextInt();
            if(usage<0){
                System.out.println("No negative numbers");
            }
            else if (usage<101){
                System.out.println("$10");
            }
            else {
                System.out.println("$40");
            }
        }
        else if (member.equalsIgnoreCase("N")) {
            System.out.println("Please subscribe");
        }
        else {
            System.out.println("Only Y/N");
        }
    }
}
