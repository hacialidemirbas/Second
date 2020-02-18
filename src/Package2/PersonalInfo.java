package Package2;
import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner myScan= new Scanner(System.in);
        System.out.println("Please enter your name:\n");
        String myName;
        myName = myScan.nextLine();
        System.out.println("Please enter your age:\n");
        int age;
        age= myScan.nextInt();
        System.out.println("Please enter your weight:\n");
        double weight;
        weight=myScan.nextDouble();
        System.out.println("Please enter your hair color:\n");
        String hairColor;
        hairColor=myScan.nextLine();
        System.out.println(myName);

    }
}
