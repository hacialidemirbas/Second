package Package8F;
import java.util.Scanner;
public class PurchaseDecision {
    public static void main(String[] args) {
        Scanner myScan= new Scanner(System.in);
        System.out.println("Please enter the color R/B");
        String myColor=myScan.nextLine();
        System.out.println("Please enter the PriceTag");
        Double myPrice= myScan.nextDouble();
        System.out.println("Please enter the discount rate (0.1-0.9)");
        float myDiscount = myScan.nextFloat();
        int colorValue =0;
        if(myColor.compareToIgnoreCase("blue")==0){
            colorValue=10;
        }
        else if(myColor.compareToIgnoreCase("red")==0){
            colorValue=20;
        }
        else{
            System.out.println("Red or Blue Only");
        }

        int PointOfItem= (int) (myPrice*myDiscount-colorValue);

        if (PointOfItem>=100){
            System.out.println("Do not buy");
        }
        else if (PointOfItem>=50&&PointOfItem<=99){
            System.out.println("Buy later");

        }
        else if (PointOfItem<50){
            System.out.println("Buy it now");
        }
    }
}
