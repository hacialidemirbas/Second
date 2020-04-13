package ArrayList;

import java.util.ArrayList;

public class ShiftLeftNumOfElement {
    public static void main(String[] args) {
        int[] orr={1,2,3,4,5,6};
        int numshift=2;
        removeFromBeginning(orr,numshift);
    }
    public static int[] removeFromBeginning(int[]arr, int num){
        ArrayList<Integer> shifted= new ArrayList<>();
        if(arr.length>0){
        for(int i=num; i<arr.length;i++){
                shifted.add(arr[i]);}}
        else{
            System.out.println("it is empty array");
        }
        int[] realresult=new int[shifted.size()];
        int index=0;
        for(int nu:shifted){
          realresult[index]  =nu;
          index++;
        }
        return realresult;

    }
}
