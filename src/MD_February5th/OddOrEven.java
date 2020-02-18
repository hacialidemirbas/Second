package MD_February5th;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = scanner.nextInt();

        if( number % 2 == 0 ){
            System.out.println(number + " is even number");
        }
        else {
            System.out.println(number + " is odd number");
        }
    }
}
