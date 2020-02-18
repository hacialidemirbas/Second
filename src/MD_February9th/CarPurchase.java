package MD_February9th;
import java.util.Scanner;
public class CarPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which model ? (X/Y) ");
        String model = scanner.next();

        int MSRP=0;//MSRP initialization

        if(model.equals("X")){

            MSRP=30000;
            System.out.print("Do you want body package? : (Y/N)");
            String body = scanner.next();
            if(body.equalsIgnoreCase("y")){
                MSRP = MSRP + 5000;
            }
            System.out.print("Do you want sound system? : (Y/N)");
            String sound = scanner.next();
            if (sound.equalsIgnoreCase("y")){
                MSRP += 3000;
            }

        }

        else if (model.equals("Y")){

            MSRP = 35000;
            System.out.print("Do you want ent. package? : (Y/N)");
            String ent = scanner.next();
            if(ent.equalsIgnoreCase("y")){
                MSRP += 8000;}

            System.out.print("Safety package? : (Y/N)");
            String safety = scanner.next();
            if(safety.equalsIgnoreCase("y")){
                    MSRP += 4000;
                }
            }

        else {
            System.out.println("Sorry have only X and Y ");
        }
        if(MSRP!=0) {
            System.out.println("$"+MSRP);
        }
    }
}
