package Exercises;
import java.util.Scanner;
public class classifyingString {
    public static void main(String[] args) {
        Scanner myInput= new Scanner(System.in);
        int[]myString=new int[20];
        for (int i=0; i<myString.length;i++){
            System.out.println("Type 20 integers");
            myString[i]=myInput.nextInt();
        }
        for (int i=0; i<myString.length;i++){
            if (myString[i]>0){
                System.out.print(myString[i]+" ");
            }

        }
        System.out.println();
        for (int i=0; i<myString.length;i++){
            if(myString[i]<0){
                System.out.print(myString[i]+" ");
            }
        }
        System.out.println();
        for (int i=0; i<myString.length;i++){
            if(myString[i]%2==0){
                System.out.print(myString[i]+" ");
            }
        }
        System.out.println();
        for (int i=0; i<myString.length;i++){
            if (myString[i]!=0){
                System.out.print(myString[i]+" ");
            }
        }

    }
}
