package Assignments;
import java.util.Scanner;
public class February_5 {
    public static void main(String[] args) {
        Scanner myReceipt = new Scanner (System.in);
        System.out.println("Enter Item ID");
        System.out.println("Enter Quantity");
        System.out.println("Enter Item Price");
        String myItems1 = myReceipt.next();
        int myQuantity1= myReceipt.nextInt();
        double myPrice1= myReceipt.nextDouble();
        System.out.println("Enter Item ID");
        System.out.println("Enter Quantity");
        System.out.println("Enter Item Price");
        String myItems2 = myReceipt.next();
        int myQuantity2= myReceipt.nextInt();
        double myPrice2= myReceipt.nextDouble();
        System.out.println("Enter Item ID");
        System.out.println("Enter Quantity");
        System.out.println("Enter Item Price");
        String myItems3 = myReceipt.next();
        int myQuantity3= myReceipt.nextInt();
        double myPrice3= myReceipt.nextDouble();
        double myTotal1=myPrice1*myQuantity1;
        System.out.println("Item Id \t\tQuantity \t\t Price \t\t \t\tTotal \n");
        System.out.println("-------- \t\t -------- \t\t-------- \t\t--------\n");
        System.out.println(myItems1+"                "+myQuantity1+"              "+myPrice1+"             "+"$"+myTotal1);
        double myTotal2=myPrice2*myQuantity2;
        System.out.println(myItems2+"                "+myQuantity2+"              "+myPrice2+"             "+"$"+myTotal2);
        double myTotal3=myPrice3*myQuantity3;
        System.out.println(myItems3+"               "+myQuantity3+"              "+myPrice3+"             "+"$"+myTotal3);
        Double myGrandTotal=myTotal1+myTotal2+myTotal3;
        System.out.println("Grand Total  ="+ "                                    "+"$"+myGrandTotal);
        System.out.println("Thank you for your shopping");




    }

}