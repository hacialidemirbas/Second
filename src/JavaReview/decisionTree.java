package JavaReview;
import java.util.Scanner;
public class decisionTree {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Where do you want to go, sea or mountain?");
        String answer1=scanner.next();
        if (answer1.equalsIgnoreCase("Mountain")){
            System.out.println("Midland or North");
            String answer2=scanner.next();
            if(answer2.equalsIgnoreCase("Midland")){
                System.out.println("You can go to Kansas");
            }
            else if (answer2.equalsIgnoreCase("North")){
                System.out.println("Vermont is a good option.");
            }
            else{
                System.out.println("destination is not valid");
            }
        }
        else if(answer1.equalsIgnoreCase("Sea")){
            System.out.println("East Coast or West Coast");
            String answer3=scanner.next();
            if(answer3.equalsIgnoreCase("East Coast")){
                System.out.println("Florida is best for you");
            }
            else if (answer3.equalsIgnoreCase("West Coast")){
                System.out.println("You can go to California");
            }
            else{
                System.out.println("destination is not valid");
            }
        }

    }
}
