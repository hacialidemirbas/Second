package MD_February9th;

import java.util.Scanner;
public class Skills {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter your skill set (Java/SQL/Cloud)");
        String answer = myScan.next();
        if(answer.equalsIgnoreCase("java")){
            System.out.print("What is your java score? (0-100): ");
            int javaScore = myScan.nextInt();

            if(javaScore>=80){
                System.out.println("Nice job");
            }
            else {
                System.out.println("You can do it");
            }
        }
        else if(answer.equalsIgnoreCase("SQL")){
            System.out.print("What is your Hackerrenk score? (0-1000) : ");
            int hackerrankScore = myScan.nextInt();
            if(hackerrankScore<500){
                System.out.println("Solve more problems");
            }
            else if(hackerrankScore<800){
                System.out.println("Nice");
            }
            else {
                System.out.println("perfect");
            }
        }
        else if(answer.equalsIgnoreCase("ClouD")){
            System.out.println("Do you have certificate? (Y/N) :");
            String certificate = myScan.next();
            if(certificate.equalsIgnoreCase("Y")){
                System.out.println("Huge plus");
            }
            else if(certificate.equalsIgnoreCase("N")){
                System.out.println("You should get one");
            }
            else {
                System.out.println("Only Y or N");
            }
        }
        else {
            System.out.println("Only Java/SQL/Cloud");
        }
    }
}
