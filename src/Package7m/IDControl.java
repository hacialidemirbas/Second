package Package7m;
import java.util.Scanner;
public class IDControl {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Do you have ID?");
        boolean ID= scanner.nextBoolean();

        System.out.println("Enter your userName");
        String userName=scanner.next();
        System.out.println("Enter your password");
        int password=scanner.nextInt();
        String defaultName="aaaa";
        int defpassword=1234;
        //ID=true;
        if(ID){
            if(userName==defaultName&&password==defpassword){
                        System.out.println("You can enter");
            }
            else{
                System.out.println("Check your password and user name");

                }

                }
        else{
        System.out.println("You cannot enter");}
    }
}
