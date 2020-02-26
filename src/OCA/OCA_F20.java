package OCA;
import java.util.Scanner;
public class OCA_F20 {
    public static void main(String[] args) {
        int age=4;
        String action="";
        if(age>25){
            action="Go to work";
        }
        else if (age<18){
            action="Go to college";
        }
        else{
            action="Go to school";
        }
        action= age>25? "Go to work": "Go to school";
        action= age>25? "Go to work": age>18? "Go to college":"Go to school";
        System.out.println(action);
    }
}
