package Package8m;

public class arraySquare {
    public static void main(String[] args) {
        int [][]myArr={{1,2,3},{4,5,6},{7,8,9}};
        int a[][]={{1,2},{3,4,5}};
        System.out.println(isSquare(myArr));
        System.out.println(isSquare(a));
        int []arr1={55,9,121,33,7,6,818,2,44,101};
        int[][]myArr2={{289,98,176},{67,100,255,65}};
        maxValue(arr1);
        maxxVal(myArr2);
        minValue(myArr2);
    }
    public static boolean isSquare(int [][] arr){

        boolean square=true;
        for(int i=0; i<arr.length;i++){
            if(arr.length!=arr[i].length){
                square=false;
            }
        }
        return square;
    }
    public static void maxValue(int []arr1){

        int max=arr1[0];
        for(int i=0;i<arr1.length-1;i++){
            if (arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println(max);
    }
    public static void maxxVal(int [][] myArr2){// int[][]myArr2={{89,98,176},{67,100,55}};
        int max=myArr2[0][0];
        for(int i=0;i<myArr2.length;i++){
            for(int j=0;j<myArr2[i].length;j++){
                if(myArr2[i][j]>max){
                    max=myArr2[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void minValue(int myArr2[][]){
        int minVal=myArr2[0][0];
        for(int i=0;i<myArr2.length;i++){
            for(int j=0;j<myArr2[i].length;j++){
                if(myArr2[i][j]<minVal){
                    minVal=myArr2[i][j];
                }
            }
        }
        System.out.println(minVal);
    }
}
