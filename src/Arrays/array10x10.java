package Arrays;

public class array10x10 {
    public static void main(String[] args) {
        int [][]myNumbers=generateArray(10);
        printArrayElements(myNumbers);




    }
    public static int [][] generateArray(int arraysize){
        int counter=1;
        int [][] array=new int[10][10];
        for (int i=0; i<array.length;i++) {
            for(int j=0;j<array[i].length;j++){
                array [i][j]=counter;
                counter++;
        }
        }
        return array;
    }
    public static void printArrayElements(int[][]arrays){
        for(int[]numberArray:arrays){
            for(int number:numberArray){
                System.out.format("%5d", number);
            }
            System.out.println();


        }
    }
    //public static void dividedByFour(int arr[][]){
      //  for (number:)
  //  }
}
