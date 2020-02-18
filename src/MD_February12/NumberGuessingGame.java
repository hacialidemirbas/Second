package MD_February12;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess = 23;
        //first time asking to user
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int userGuess = myScanner.nextInt();

        //Asking user untill user guesses the number
        while(userGuess!=numberToGuess) {
            System.out.print("Guess the number: ");
            userGuess = myScanner.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("Number is larger");
            } else if (userGuess < numberToGuess) {
                System.out.println("Number is smaller");
            }
            else {
                System.out.println("Congrats...");
            }
        }


    }
}
