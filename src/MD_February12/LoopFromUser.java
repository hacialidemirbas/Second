package MD_February12;
import java.util.Scanner;
public class LoopFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting point : ");
        int start = scanner.nextInt();
        System.out.print("Enter end point : ");
        int end = scanner.nextInt();
        System.out.print("Enter what you want to print : ");
        String toPrint = scanner.next();

        for(int i=start ; i<end ; i++){
            System.out.println(toPrint);
        }
    }
}
