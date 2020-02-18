package Package8F;
import java.util.Scanner;
public class JavaPoint {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Scanner myScanner1= new Scanner (System.in);
        int myAge=myScanner.nextInt();
        int myJavaScore=myScanner1.nextInt();
        if ((myAge>=20 && myAge<=30) && myJavaScore>=80){
            System.out.println(myAge*1.5+myJavaScore*4.5);
        }
        else if(myAge>=30 && myJavaScore<80){
            System.out.println(myAge*1.5+myJavaScore*3.5);
        }
        else if((myAge>30) && myJavaScore>=80){
            System.out.println(myAge*1.1+myJavaScore*4.5);
    }
        else if((myAge>30) && myJavaScore<80){
            System.out.println(myAge*1.1+myJavaScore*3.5);
        }
        else{
            System.out.println("Please enter a valid age or Java Score");
        }

        }
}
