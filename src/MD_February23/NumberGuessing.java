package MD_February23;
import java.util.Scanner;
public class NumberGuessing {
    public static void guessTheNumber(int number){
        Scanner myScan = new Scanner(System.in);
        int userGuess=0;
        while(userGuess!=number){
            System.out.print("Guess the number: ");
            userGuess=myScan.nextInt();

            if(userGuess==number){
                System.out.println("CONGRATS");
            }
            else if(userGuess>number){
                System.out.println("Try smaller");
            }
            else {
                System.out.println("Try larger");
            }


        }
    }
}
