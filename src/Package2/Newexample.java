package Package2;
import java.util.Scanner;
public class Newexample {
    public static void main(String[] args) {
        Scanner myInt= new Scanner(System.in);
        System.out.println("Enter an Enteger Number");
        int number = myInt.nextInt();
        int remainder= number%2;
        if(remainder==1){
            System.out.println("odd");

        }
    }
}
//edabit
//codesignal
