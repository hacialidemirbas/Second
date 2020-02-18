package Package4;
import java.util.Scanner;
public class AgeInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int myAge=myScanner.nextInt();

        if(myAge<0){
            System.out.println("Age can not be negative");
        }
        else if (myAge>120){
            System.out.println("Age can not be older than 120");
        }
        else {
            System.out.println("It is OK");
        }
    }



}
