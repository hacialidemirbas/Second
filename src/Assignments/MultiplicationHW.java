package Assignments;

public class MultiplicationHW {

    public static void main(String[] args) {
        int j;
        for (j = 1; j < 10; j++) {
            System.out.print("    ");
            System.out.format("%7s",j);}
        System.out.println('\n'+"--------------------------------------------------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.print(i+"  :");
            for (j = 1; j < 10; j++) {
                    System.out.format(   "%10s",(i*j));
                }
            System.out.println('\n');

            }
        }
    }

