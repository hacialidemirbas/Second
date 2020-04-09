package Exercises;

import java.util.Arrays;

public class mixMixLoop {
    public static void main(String[] args) {
        int[] []numbers={{1,2,3,4,5},
                         {2,4,6,8,9}};
        //reverse temp=1
        int revNum[][]= new int[2][5];
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                int temp=numbers[i][j];
                revNum[i][j]=numbers[i][numbers[i].length-j-1];
                numbers[i][numbers[i].length-j-1]=temp;
               System.out.print("rev"+revNum[i][j]);
                //System.out.print("num"+numbers[i][j]);
                //System.out.print("temp"+temp);

            }
           // System.out.println(Arrays.toString(revNum));
            System.out.println();
        }

    }
}