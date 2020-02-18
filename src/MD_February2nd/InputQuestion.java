package MD_February2nd;
import java.util.Scanner;
public class InputQuestion {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String name;
        name = myScan.nextLine();
        int age;
        age = myScan.nextInt();
        double weight;
        weight = myScan.nextDouble();
        String hairColor;
        System.out.format("%s\n",name);
       System.out.format("%i",age);
        System.out.format("%.1f",weight);


    }
}
