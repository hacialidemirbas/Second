package Package7m;
import java.sql.SQLOutput;
import java.util.Scanner;
public class decisionTree2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Road tested?");
        String answer1=scanner.next();
        if(answer1.equalsIgnoreCase("yes")){
            System.out.println("Does it have high milage");
            String answer2=scanner.next();
            if(answer2.equalsIgnoreCase("yes")){
                System.out.println("Is it old?");
                String answer3=scanner.next();
                if(answer3.equalsIgnoreCase("yes")){
                    System.out.println("Do not buy");
                }
                else{
                    System.out.println("Buy the car");
                }

            }
            else {
                System.out.println("Buy the car");
            }

        }
        else{
            System.out.println("Do not buy");
        }

    }
}
