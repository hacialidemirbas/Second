package JavaReview;

import java.util.Arrays;

public class seperateIntegers {
    public static void main(String[] args) {
        int []array={0,5,4,3,2,1,0};
        int[] result=seperateZeros(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] seperateZeros(int []arr){
        int[]array1=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){

                if((arr[i])!=0)  {
                    array1[index]=arr[i];
                    index++;
            }

        }
return array1;

    }
}
