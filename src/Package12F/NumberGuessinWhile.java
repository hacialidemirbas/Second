package Package12F;

import java.util.Scanner;

public class NumberGuessinWhile {
    public static void main(String[] args) {
        int numberToGuess = 10;

        Scanner myScanner = new Scanner(System.in);
        int userGuess = 0;
        while (userGuess != numberToGuess) {

            System.out.println("Guess the number");
            userGuess = myScanner.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("Larger, try again");
            } else if (userGuess < numberToGuess) {
                System.out.println("Smaller, try again");
            } else {
                System.out.println("Congratulation");
            }
        }
    }
}