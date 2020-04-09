package JavaReview;
import java.util.Scanner;
public class ChatProgram {
    public static void main(String[] args) {
        String answer=" ";
        Scanner myScan=new Scanner(System.in);

        while(!answer.equalsIgnoreCase("you won")){
            System.out.println("Say something : ");
            answer=myScan.nextLine();
            System.out.println("You said  "+answer);
        }
        System.out.println("I knew I will win");
    }
}
