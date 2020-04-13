package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CuttingArray {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> halfList = cutInHalf(myList);
        System.out.println(halfList);
        cutAndPrint(myList);
    }
    public static ArrayList<Integer> cutInHalf(ArrayList<Integer> listToCut){
        int halfIndex = listToCut.size()/2;
        ArrayList<Integer> half = new ArrayList<>();
        for (int i=0 ; i < halfIndex ; i++){
            half.add(listToCut.get(i));
        }
        return half;
    }
    public static void cutAndPrint(ArrayList<Integer> arr){
        ArrayList<Integer> half1 = new ArrayList<>();
        ArrayList<Integer> half2 = new ArrayList<>();
        int indexHalf = arr.size()/2;
        for(int i=0 ; i<indexHalf ; i++){
            half1.add(arr.get(i));
        }
        for(int i=indexHalf ; i < arr.size() ; i++){
            half2.add(arr.get(i));
        }
        System.out.println(half1 + " - "+half2);
    }
}
