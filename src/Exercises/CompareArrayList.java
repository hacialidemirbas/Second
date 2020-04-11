package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>orr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> orr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5));
        ArrayList<Integer> orr3 = new ArrayList<>(Arrays.asList(1, 2, 4, 4,0));
        System.out.println(compareArrList(orr1,orr2));
        System.out.println(compareArrList(orr1,orr3));

    }
    public static boolean compareArrList(ArrayList<Integer> arr1, ArrayList<Integer>arr2){
        boolean result = true;
        for(int i=0; i<arr1.size();i++){
            if(arr1.get(i)!=arr2.get(i)){
                result= false;
            }
        }
        return result;

    }
}
