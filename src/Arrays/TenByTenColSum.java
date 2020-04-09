package Arrays;

public class TenByTenColSum {
    public static void main(String[] args) {
        int [][]numbers=TenByTenArray.generateArray(10);
        printSumOfColumns(numbers);

    }
    public static void printSumOfColumns(int [][]arr){

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[j][i];
            }
            System.out.println(sum);
        }
    }
}
