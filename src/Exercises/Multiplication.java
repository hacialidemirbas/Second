package Exercises;

public class Multiplication {
    public static void main(String[] args) {
        System.out.format("\t\t\t1\t\t2\t\t3\t\t4\t\t5\t\t6\t\t7\t\t8\t\t9\t\t10\n");
        System.out.println("--------------------------------------------------------------------------------------");
        for(int i=1;i<11;i++){
            System.out.print(i+"\t\t:\t");
            for(int j=1; j<11;j++){

                System.out.format((i*j)+"\t\t");

            }
            System.out.println();
        }
    }
}
