package JavaReview;

import org.w3c.dom.ls.LSOutput;

public class Transpose {
    public static void main(String[] args) {
        int[][]matrix={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        for(int row[]:matrix){
            for(int num:row){
                System.out.println(num+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of matrix: ");
        if(matrix.length>0){
            for(int i=0;i<matrix[0].length;i++){
                for(int j=0;j<matrix.length;j++){
                    System.out.print(matrix[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}
