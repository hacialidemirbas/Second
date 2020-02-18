package MD_February15;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess = 23;

        Scanner myScanner = new Scanner(System.in);
        int userGuess=0;

        //Asking user until user guesses the number
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