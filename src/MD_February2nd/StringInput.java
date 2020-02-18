package MD_February2nd;
import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a String :");
        String myStr;
        myStr = scanner.nextLine();
        System.out.println("Your string is :" + myStr);
    }
}
