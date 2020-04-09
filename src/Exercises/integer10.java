package Exercises;
import java.util.Scanner;
public class integer10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] z = new int[10];
        for(int i = 0;i<z.length;i++){
            System.out.println("Print the value of z["+i+"]");
            z[i] = s.nextInt();
        }
        for(int i = 0;i<z.length;i++){
            System.out.println("The value of z["+i+"] is "+z[i]);
        }
    }
}
