package MD_February10th;
import  java.util.Scanner;
public class MultiplesOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter start number : ");
        int start = scanner.nextInt();
        System.out.print("Please enter end number : ");
        int end = scanner.nextInt();

        if(start<end){
            for (int i=start ; i <= end ; i=i+5){
                System.out.println(i);
            }
        }
        else {
            for(int i=start ; i >= end ; i=i-5){
                System.out.println(i);
            }
        }
    }
}
