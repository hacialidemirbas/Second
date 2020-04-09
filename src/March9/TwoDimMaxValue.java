/*package March9;

public class TwoDimMaxValue {
    public static void main(String[] args) {
        int[][] myArr = {{1,2,3},{4,5,6},{7,8,9}};
        //printRowsMax(myArr);
        int[] maxNumbers = returnRowsMax(myArr);
        //System.out.println(maxNumbers);
        /*
        for(int number:maxNumbers){
            System.out.println(number);
        }
​
         */
    /*    printRowsMin(myArr);
    }
    public static int returnMax(int[] array){
        int max = array[0];
        for(int number:array){
            if(number>max){
                max=number;
            }
        }
        return max;
    }
    public static int returnMin(int[] array){
        int min = array[0];
        for(int number:array){
            if (number<min){
                min = number;
            }
        }
        return min;
    }
    public static void printRowsMax(int[][] arr){
        for(int[] row : arr){
            System.out.println(returnMax(row));
        }
    }

    public static int[] returnRowsMax(int[][] arr){
        int maxes[] = new int[arr.length];
        int index=0;
        for(int row[] : arr){
            maxes[index]=returnMax(row);
            index++;
        }
        return maxes;
    }
    public static void printRowsMin(int arr[][]){
        int index=0;
        for(int[] row:arr){
            System.out.println("Min of row"+index+" "+returnMin(row));
            index++;
        }
    }
    public static int[] returnRowsMin(int[][]arr){
        int[] mins = new int[arr.length];
        int index=0;
        for(int []row : arr){
            mins[index] = returnMin(row);
        }
        return mins;
    }
}*/