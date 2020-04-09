package Arrays;

public class tenByTen {
    public static void main(String[] args) {
        ByTen(10);

    }
    static void ByTen(int array){
        int [][] arr= new int[array][array];
        int counter=1;
        int sumOfRows=0;
        int sumOfCol=0;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=counter;
                System.out.print(arr[i][j]+"\t");
                counter++;
                sumOfRows+=arr[i][j];
            }
            System.out.println("\t\t"+sumOfRows);
            sumOfRows=0;
            System.out.println();

        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                sumOfCol += arr[j][i];
            }
            System.out.print(sumOfCol+" ");
             sumOfCol=0;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]%4==0){
                    System.out.print(arr[i][j]+"\t\t");
                }
            }
            System.out.println();
        }
        counter=1;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<=i;j++){
                arr[i][j]=counter;
                System.out.print(arr[i][j]+"\t");
                counter++;
            }
            System.out.println();
    }
}}
