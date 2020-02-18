package Package9F;
import java.util.Scanner;
public class LetterGrades {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please enter grade");
        int myGrade = myScanner.nextInt();

        if(myGrade<0){
            System.out.println("Grade can not be less than )!");
        }
        else if (myGrade<50){
            System.out.println("Fail");
        }
        else if (myGrade<60){
            System.out.println("D");
        }
        else if(myGrade<70){
            System.out.println("C");
        }
        else if (myGrade<80){
            System.out.println("B");
        }
        else if (myGrade<90){
            System.out.println("A");
        }
        else if (myGrade<101){
            System.out.println("A+");
        }
        else {
            System.out.println("The grade cannot be larger than 100");
        }
    }
}
