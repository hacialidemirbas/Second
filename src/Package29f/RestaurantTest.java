package Package29f;
import java.util.Scanner;

import static Package29f.displayMenu.*;

public class RestaurantTest {
    public static void main(String[] args) {
        showMenu();
        Scanner scanner= new Scanner (System.in);
        System.out.println("Choose your soup (1-Lentil, 2- Tomato, 3-Fish)");
        int soup=scanner.nextInt();
        System.out.println("Choose your meal (1-Rice, 2- Chicken, 3- Beef)");
        int meal= scanner.nextInt();
        System.out.println("Choose your salad (1-Ceaser, 2- Waldorf)");
        int salad= scanner.nextInt();
        showwBill(2,3,1);

        }
        public static void showwBill(int soup, int meal, int salad){
        double total=0;
            System.out.println("\t\t---RECEIPT---");
            if (soup==1){
                System.out.println("Lentil : \t\t$3.99");
                 total+=  3.99;         }
            else if (soup==2){
                System.out.println("Tomato :\t\t$4.99");
                total+=4.99;
            }
            else{
                System.out.println("Fish:  \t\t$8.99");
                total+=8.99;
            }
            if (meal==1){
                System.out.println("Rice : \t\t$3.99");
                total+=3.99;
            }
            else if (meal==2){
                System.out.println("Chicken :\t\t$5.99");
                total+=5.99;
            }
            else{
                System.out.println("Beef:  \t\t$7.99");
                total+= 7.99;
            }
            if (salad==1){
                System.out.println("Ceaser : \t\t$3.99");
                total+=3.99;
            }
            else{
                System.out.println("Waldorf:  \t\t$7.99");
                total+= 7.99;
            }
            System.out.println("______________________\n"+"\t\t\t\t$"+total);
        }

    }

