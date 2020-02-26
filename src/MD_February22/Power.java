package MD_February22;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int base = scanner.nextInt();
        System.out.print("Enter power number : ");
        int power = scanner.nextInt();

        System.out.println((int)Math.pow(base,power));
        PrintingMultiplicationTable.printMultiplicationTable();
    }
}
