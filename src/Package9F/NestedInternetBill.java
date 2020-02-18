package Package9F;
import java.util.Scanner;
public class NestedInternetBill {
    public static void main(String[] args) {

        Scanner myScanner= new Scanner(System.in);
        System.out.println("Are you subscribed? Y/N");
        String myMember= myScanner.next();

        if(myMember.equalsIgnoreCase("Y")){
            //ask usage
            System.out.println("Enter usage please (1-100):");
            int myUsage=myScanner.nextInt();
            if (myUsage<0){
                System.out.println("No negative numbers");
            }
            else if (myUsage < 101) {

                System.out.println("$10");
            }
            else{
                System.out.println("$40");
            }

        }
        else {
            System.out.println("Please subscribe");}


    }
}
