package Package12F;
import java.util.Scanner;
public class WhileLoopYes {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);

        String answer="";
        while(!answer.equalsIgnoreCase("Y")){
            System.out.println("Java is fun? (y/n)");
         answer=myScanner.next();

        }

        System.out.println("I knew you liked JAVA");
    }
}
