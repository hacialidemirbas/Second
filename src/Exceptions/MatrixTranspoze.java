package Exceptions;
import java.util.Arrays;
public class MatrixTranspoze {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{4,5,6},{7,8}};
        for(int[] row:arr){
            System.out.println(Arrays.toString(row));
        }
        System.out.println(Arrays.toString(arr));//to show how Arrays.toString() works
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[j][i] + "\t");
                }
                System.out.println();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("oops");
        }
        finally {
            System.out.println("Hello World");
        }
        for(int i=0 ; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                try{
                    System.out.print(arr[j][i]+"\t");
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.print("oops2");
                }
            }
            System.out.println();
        }
    }
}
