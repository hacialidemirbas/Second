package Package7m;
import java.util.Scanner;
public class decideGates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where are you going?Europe, Africa, Asia, America");
        String Destination = scanner.next();
        if (Destination.equalsIgnoreCase("Europe")) {
            System.out.println("Go to Gate A");
        } else if (Destination.equalsIgnoreCase("Africa")) {
            System.out.println("Go to Gate B");
        } else if (Destination.equalsIgnoreCase("Asia")) {
            System.out.println("Go to Gate C");
        } else if (Destination.equalsIgnoreCase("America")) {
                System.out.println("Go to Gate D");
            }
        else{
                System.out.println("Wrong destination");
            }

        }
    }

