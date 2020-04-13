package ArrayList;

import java.util.ArrayList;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(ConvertToArrayList(arr));
        ArrayList<Integer>result =new ArrayList<Integer>();
        for(int i=0;i<arr.length ; i++){
            result.add(arr[i]);

        }
        System.out.println(result);


    }
        public static ArrayList<Integer> ConvertToArrayList(int[]arr){

            ArrayList<Integer>result =new ArrayList<Integer>();
            for(int element : arr){
                result.add(element);
            }
            return result;

        }

}
