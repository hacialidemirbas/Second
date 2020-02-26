package Package12F;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess=10;
        System.out.println("Guess the number");
        Scanner myScanner=new Scanner(System.in);
        int myNumber=myScanner.nextInt();
        if(myNumber>numberToGuess){
            System.out.println("Larger, try again");
        }
        else if(myNumber<numberToGuess){
            System.out.println("Smaller, try again");
        }
        else{
            System.out.println("Congratulation");
        }
    }
}
