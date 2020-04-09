package Package7m;
import java.util.Scanner;
public class decisionTree {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Does the animal  breath?");
       // boolean  answer1= scanner.nextBoolean();// answer should be true or false
        String answer1= scanner.next();
        if(answer1.equalsIgnoreCase("Yes")){

        //if(answer1){
            System.out.println("Does the animal lay egg?");
        String answer2=scanner.next();
           // boolean answer2= scanner.nextBoolean();
            //if(answer2){
        if (answer2.equalsIgnoreCase("Yes")){
                System.out.println("It is a bird");
            }
            else{
                System.out.println("It is a mammal");
            }
        }
        else
        {
            System.out.println("It is a fish");
        }


    }
}
