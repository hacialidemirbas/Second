package March9;

public class maxMin {
    public static void main(String[] args) {
        int [][]myArr={{1,2,-3},{4,5,-6},{7,8,-9}};
        int[]arrayMax=returnMaxRow(myArr);
        for(int number:arrayMax){
            System.out.print(number);
        }

        System.out.println();
        printRowsMax(myArr);
        System.out.println();
        printRowsMin(myArr);
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
    public static int [] returnMaxRow(int [][]arr){
        int[]maxes=new int [arr.length];
        int index=0;
        for(int []row:arr){
            maxes[index]=returnMax(row);
            index++;
        }
        return maxes;
    }


    public static int returnMin(int[]array){
        int min= array[0];
        for(int number:array){
            if(number<min){
                min=number;
            }
        }
        return min;
    }
    public static void printRowsMin(int[][]arr){
        for(int[] row:arr){
            System.out.print(returnMin(row));

        }
    }
    public static void printRowsMax (int [][]arr){
        for(int[]row:arr){
            System.out.print(returnMax(row));
        }
    }

}
