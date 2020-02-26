package Exercises;
public class Starpatterns {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            for(int j=10;j>=i;j--){
                System.out.print(" ");}

            for(int k=0;k<=i;k++){

                System.out.print("*");}

            System.out.println();
        }
        for(int i=0;i<=10;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<=10;i++){
            for(int j=10;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=10;i++){
            for(int k=0;k<=i;k++){
            System.out.print(" ");
        }
            for (int j=10;j>=i;j--){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=10;i>=0;i--){
            for(int j=10;j>=0;j--){
                System.out.print("0  ");

            }
            System.out.println();
        }
        for(int i=1; i<=6;i++){
            for(int j=6;j>i;j--){
                System.out.print("0  ");
            }
            for(int k=1;k<=((2*i)+1);k+=2){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
