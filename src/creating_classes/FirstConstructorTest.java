package creating_classes;
import java.util.Scanner;
public class FirstConstructorTest {
    public static void main(String[] args) {
        FirstConstructor myFirst= new FirstConstructor();
        System.out.println(myFirst.number);
        FirstConstructor mySecond= new FirstConstructor();
        System.out.println(mySecond.number);
        Scanner myScan= new Scanner(System.in);
        //Scanner= class, myScan= object,= new= key, Scanner(System.in)= constructor;
    }
}
