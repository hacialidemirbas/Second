package Package4;
import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner myTemperature= new Scanner(System.in);
        System.out.println("Please enter temperature");
        int temp=myTemperature.nextInt();
        if(temp<=20){
            System.out.println("Winter");

        }
        else if (temp>20 && temp<41){
            System.out.println("Fall");
        } else if (temp > 40 && temp < 61) {
            System.out.println("Spring");
        }
        else
        {
            System.out.println("Summer");
        }



    }
}
