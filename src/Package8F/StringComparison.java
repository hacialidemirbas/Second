package Package8F;
import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args) {
        System.out.println("Please enter your gender");
        Scanner myScanner= new Scanner (System.in);
        String myGender= myScanner.next();

        if (myGender.equals("M")||myGender.equals("m")){
            System.out.println("Male");
        }
        else if(myGender.equals("F")||myGender.equals("f")){
            System.out.println("Female");
        }
        else {
            System.out.println("Please enter only M or F");
        }

    }
}
