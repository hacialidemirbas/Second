package MD_February5th;
import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
        //Asking temperature from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature : ");
        int temp = scanner.nextInt();
        //checking temperature
        if(temp<=20){ //if temp is below 20 degrees
            System.out.println("Winter");
        }
        else if (temp>20 && temp <41){
            System.out.println("Fall");
        }
        else if (temp>40 && temp<61){
            System.out.println("Spring");
        }
        else {
            System.out.println("Summer");
        }
    }
}
