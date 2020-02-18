package Package9F;
import java.util.Scanner;
public class CarPurchase {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please choose the model: Model X / Model Y");
        String myModel = myScanner.next();
        int MSRP = 0;

        if (myModel.equalsIgnoreCase("X")) {
            MSRP = 30000;
            System.out.println("Do you want body package? Y/N");
            String myBody = myScanner.next();
            if (myBody.equalsIgnoreCase("Y")) {
                MSRP += 5000;
            }
            System.out.println("Do you want sound package? Y/N");
            String mySound = myScanner.next();
            if (mySound.equalsIgnoreCase("Y")) {
                MSRP += 3000;

            }

        }
        else if (myModel.equalsIgnoreCase("Y")) {
            MSRP = 35000;
            System.out.println("Do you want ent package? Y/N");
            String myEnt = myScanner.next();
            if (myEnt.equalsIgnoreCase("Y")) {
                MSRP += 8000;}
            System.out.println("Safety Package: (Y/N)");
            String mySafety= myScanner.next();
            if(mySafety.equalsIgnoreCase("Y")){
                MSRP +=4000;
                }
            }


        else{
            System.out.println("Sorry only X andY");
        }
        if(MSRP!=0) {
            System.out.println("$"+MSRP);}

    }
}
