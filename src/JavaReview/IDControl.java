package JavaReview;
import java.util.Scanner;
public class IDControl {
    public static void main(String[] args) {
        boolean id=true;
        System.out.println("Show your ID");
        Scanner scanner=new Scanner(System.in);
        id=scanner.nextBoolean();
        if(id){
            System.out.println("Welcome to the building");

        }
        else{
            System.out.println("No valid ID detected");
        }
        Login();
    }
    public static void Login(){
        Scanner scanner=new Scanner(System.in);
       // String userName="abcde";
        //int password=12345;
        System.out.println("Enter username");
        String userN= scanner.next();
        System.out.println("Enter your password");
        int pass= scanner.nextInt();
        if(userN=="abcde"||pass==12345){
            System.out.println("Welcome");
                   }
        else{
            System.out.println("Invalid username or password");
        }
    }
}
