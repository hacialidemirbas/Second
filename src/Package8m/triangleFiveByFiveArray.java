package Package8m;

public class triangleFiveByFiveArray {
    public static void main(String[] args) {
        int [][]nums=createArray(10,10);
        printNumbersTriangle(nums);

            }

    public static int[][] createArray(int rows, int cols){
        int [][]numbersArray=new int [rows][cols];
        int number=1;
        for (int i=0;i<numbersArray.length;i++){
            for(int j=0; j<numbersArray[i].length;j++){
                numbersArray[i][j]=number;
                number++;
            }
        }
        return numbersArray;
    }
    public static void printNumbersTriangle(int numbers[][]){
        for (int i=0;i<numbers.length;i++){
            for(int j=0; j<=i;j++){
                System.out.print("\t"+numbers[i][j]);
            }System.out.println();
        }

    }

}
