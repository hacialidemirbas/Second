package OCA;
import java.util.Scanner;
public class JavaUnary {
    public static void main(String[] args) {
        int y=10;
        int x=-y; //negates
        System.out.println(x);


        int age=17;
        if(!(age<17)){ // ! makes true to false; false to True
            System.out.println("Go to school");
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name=sc.nextLine();
            if(!name.equals("Jason")){
                System.out.println("You can go through");
            }
        }
    }
}
