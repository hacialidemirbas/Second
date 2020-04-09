package Package7m;
import java.util.Scanner;
public class iterationLoopStructure3 {
    public static void main(String[] args) {
        String word="";
        Scanner scanner= new  Scanner(System.in);

        while(!word.equalsIgnoreCase("you won")) {
            System.out.println("Enter the word");
            word = scanner.nextLine();
            if (!word.equalsIgnoreCase("you won")) {
                System.out.println("You said  :  " + word);
            }
        }
        System.out.println("I knew I will win!!!");

    }
}
