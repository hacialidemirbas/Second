package Package10F;
import java.util.Scanner;
public class Numbers5By5 {
    public static void main(String[] args) {
        Scanner myScanner=  new Scanner(System.in);
        System.out.println("Please enter start number   :   ");
        int myStart = myScanner.nextInt();
        System.out.println("Please enter end number:    ");
        int myEnd=myScanner.nextInt();
        if (myStart<myEnd){
            for (int i=myStart;i<=myEnd; i=i+5){
                System.out.println(i);
            }
        }
        else{
            for(int i=myStart;i>=myEnd;i=i-5){
                System.out.println(i);
            }
        }


    }
}
