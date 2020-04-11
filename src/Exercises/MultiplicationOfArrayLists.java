package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationOfArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> arr2= new ArrayList<Integer>(Arrays.asList(5,6,7,8));
        ArrayList<Integer> arr3= new ArrayList<Integer>();
        for (int i=0; i< arr1.size();i++){
            arr3.add(arr1.get(i)*arr2.get(i));

        }
        System.out.println(arr3);
    }

}
