package Exercises;
import java.util.Scanner;
public class storeInteger {
    public static void main(String[] args) {
        Scanner myStore= new Scanner(System.in);
        int myString[] = new int[10];
        for(int i=0; i<myString.length;i++){
            System.out.println("enter integer value of myStore");
            myString[i]=myStore.nextInt();
            }
        //Scanner myInt=new Scanner (System.in);
        System.out.println("Enter number to compare");
        int myInt= myStore.nextInt();
        for(int i=0;i<myString.length;i++){
            if(myInt==myString[i]){
                System.out.println("The integer\t\t"+myString[i]+"\t\tis exist in the array");
            }
        }



    }
}
