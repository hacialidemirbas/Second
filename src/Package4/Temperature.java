package Package4;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        int myTemperature;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Please enter temperature");
        myTemperature = sc.nextInt();
        if (myTemperature <= 30) {
            System.out.print("You should wear jacket");
        } else {
            System.out.println("You do not need to wear jacket but you can wear a hat");
        }
    }
}