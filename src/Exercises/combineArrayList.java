package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class combineArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> orrString1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> orrString2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9));
        combineArrList(orrString1,orrString2);


    }

    public static void combineArrList(ArrayList<Integer> arr, ArrayList<Integer> arr1) {
        ArrayList<Integer> unitedArrayList = new ArrayList<>();
        for (int element : arr) {
            unitedArrayList.add(element);
        }
        for (int element : arr1) {
            unitedArrayList.add(element);
        }
        System.out.println(unitedArrayList);
    }
}
