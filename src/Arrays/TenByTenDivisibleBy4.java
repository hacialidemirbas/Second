package Arrays;

public class TenByTenDivisibleBy4 {
    public static void main(String[] args) {
        int [][]numbers=TenByTenArray.generateArray(10);
        divisibleByFour(numbers);

    }
    public static void divisibleByFour(int arr [][]){
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int num=arr[i][j];
                if(arr[i][j]%4==0)
                    System.out.print("\t"+num);
                else
                    System.out.print("\t -");
                }
                System.out.println();
            }
        }
    }

