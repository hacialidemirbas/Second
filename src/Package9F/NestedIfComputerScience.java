package Package9F;
import java.util.Scanner;
public class NestedIfComputerScience
{
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Which one do you know? JAVA/SQL/Cloud");
        String mySkill= myScanner.next();
        if(mySkill.equalsIgnoreCase("JAVA")){
            System.out.println("What is your Java score?");
            int myJavaScore= myScanner.nextInt();
            if(myJavaScore>=80){
                System.out.println("Nice job!");
            }
            else {
                System.out.println("You can do it");
            }
        }
        else if(mySkill.equalsIgnoreCase("SQL")){
            System.out.println("What is your Hackerrank score?");
            int myHackerrankScore= myScanner.nextInt();
            if(myHackerrankScore<500){
                System.out.println("Solve more problems");
            }
            else if (myHackerrankScore<800){
                System.out.println("Nice");
            }
            else{
                System.out.println("Perfect");
            }
        }
        else if(mySkill.equalsIgnoreCase("Cloud")){
            System.out.println("Do you have certificate? Y/N");
            String myCertificate=myScanner.next();
            if ( myCertificate.equalsIgnoreCase("Y")){
                System.out.println("Huge Plus");
            }
            else if (myCertificate.equalsIgnoreCase("N")){
                System.out.println("You should get one");
            }

        }
        else {
            System.out.println("OnlyJAVA/SQL/Cloud");
        }
    }
}
