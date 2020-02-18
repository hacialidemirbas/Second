package Package2;
import java.util.Scanner;
public class SampleKeyboardInput {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String myName;
        myName=myScan.next();
        Scanner readKeyboard=new Scanner(System.in);
        System.out.println("Your name is :" + myName);



    }
}
