package Package4;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        int myNumber;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.print("Please enter an integer number");
        myNumber=sc.nextInt();
        if(myNumber%2==0){
            System.out.print(myNumber+"is an even number");
        }
        else {
            System.out.println(myNumber+" is an odd number");
        }
    }

    }