package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList <Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4,4,5,5,6,6,7,8,9));
        ArrayList<Integer> newList=new ArrayList<>();
        for(int number:arr){
            if(!newList.contains(number)){
                newList.add(number);
            }
        }
        System.out.println(newList);
    }
}
