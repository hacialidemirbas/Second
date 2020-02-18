package Package9F;
import java.util.Scanner;
public class ArtOrMath {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please Chose Subject : Math or Art");
        String mySubject=myScanner.next();
        if (mySubject.equalsIgnoreCase("Math")){
            System.out.println("Do you want tutor? : (Y/N)");
            String myTutor= myScanner.next();
            if (myTutor.equalsIgnoreCase("Y")){
                System.out.println("OK");
            }
            else if(myTutor.equalsIgnoreCase("N")){
                System.out.println("Study yourself");
            }
            else{
                System.out.println("Y or N Please");
            }

        }
        else if (mySubject.equalsIgnoreCase("Art")){
            System.out.println("Nice Choice");
        }
    }
}
