package methodsandlibraries;

import java.util.Scanner;

public class printAll {
    //ANSWERS ARE IN printAllTest

    //Method to print from 100 to 1000
    public static void printAllWhole() {
        int start = 100;
        while (start <= 1000) {
            System.out.print(start);
            start++;
        }
    }
//Method to all ASCII values and CHARS
    public static void allASCII() {
        for (int i = 0; i < 256; i++) {
            System.out.println("Number: "+i+" "+"Characters: "+(char) i);
        }
    }

    public static void guessGame (int number){
        Scanner myScann=new Scanner(System.in);
        int numberToGues= 0;
        while (numberToGues!=number){
            System.out.println("Gues the number: ");
            numberToGues=myScann.nextInt();
            if(numberToGues==number){
                System.out.println("Cong");
                            }
            else if (numberToGues>number){
                System.out.println("Try smaller number");
            }
            else
            {
                System.out.println("Try larger number");
            }
        }


    }
    public static void allDates(int y){
    for(int m=1;m<13;m++ ){
        System.out.println();
        for(int d=1; d<31;d++){
            System.out.println(m+"/ "+d+"/ "+y);
        }
    }

    }
    public static void numberLoop(){
        int number=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();

        }
    }
    public static void printABCD(){
        for(int i=1; i<=5;i++){
            System.out.print(i);
            for(char j=97;j<102;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
