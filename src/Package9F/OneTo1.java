package Package9F;
import java.util.Scanner;
public class OneTo1 {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please enter number as text(one-ten) ;");
        String myNumber= myScanner.next();
        switch (myNumber){
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;
            case "6":
                System.out.println("Six");
                break;
            case "7":
                System.out.println("Seven");
                break;
            case "8":
                System.out.println("Eight");
                break;
            case "9":
                System.out.println("Nine");
                break;
            case "10":
                System.out.println("Ten");
                break;
            default:
            {
                System.out.println("Only numbers");
                break;
            }


        }


    }
}
