package Package2;
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[]args){
        Scanner myKeyboard = new Scanner(System.in);
        int userInput;
        userInput = myKeyboard.nextInt();
        System.out.println(userInput);
    }
}