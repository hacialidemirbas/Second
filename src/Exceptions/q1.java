package Exceptions;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
q1.division();
    }
    public static void division(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first number");
        int first= scan.nextInt();
        System.out.println("Enter the second number");
        int second= scan.nextInt();
        try{
            System.out.println(first/second);
                    }
        catch(ArithmeticException e){
            System.out.println("Sorry I cannot divide to zero, try again");
        }
    }
}
