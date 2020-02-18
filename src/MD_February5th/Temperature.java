package MD_February5th;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        int temp = scanNumber.nextInt();
        if(temp>30){
            System.out.println("Wear a hat");
        }
        else {
            System.out.println("Wear a jacket");
        }
    }
}
