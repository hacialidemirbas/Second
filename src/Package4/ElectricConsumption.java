package Package4;
import java.util.Scanner;
public class ElectricConsumption {
    public static void main(String[] args) {
        System.out.println("PLease Enter Your Electric Consumption");
        Scanner myScanner=new Scanner(System.in);
        int myConsumption= myScanner.nextInt();
        if (myConsumption<500){
            System.out.println(myConsumption*.03);
        }
        else if(myConsumption>=500&&myConsumption<=1000){
            System.out.println(myConsumption*.04);

        }
        else if (myConsumption>1000&&myConsumption<=2000){
           System.out.println(myConsumption*.05);
        }
        else{
            System.out.println(myConsumption*.06);
        }
    }
}
