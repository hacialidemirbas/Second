package JavaReview;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][]numbers={{1,2,3},{4,5,6}};
        System.out.println(numbers[1][0]);//to print 4

     /*   for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");//to print all

            }
            System.out.println();
        }*/
     numbers[1][2]=16;//i assigned new value
        for(int[] oneDim:numbers){
            for(int element:oneDim){
                System.out.print(element+"\t");
            }
            System.out.println();

        }

    }
}
