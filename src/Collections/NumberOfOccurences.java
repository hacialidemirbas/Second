package Collections;

import java.util.HashMap;

public class NumberOfOccurences {
    public static void main(String[] args) {
        HashMap<Integer,Integer>myMap=new HashMap<>();
        myMap.put(1,4);
        System.out.println(myMap);
        myMap.put(1,5);
        System.out.println(myMap);
        int[]arr={1,2,3,4,3,4,5,6,7,5,3,4,1};
        findFrequinceds(arr);
    }
public static void findFrequinceds(int []arr){
    HashMap<Integer,Integer>freq=new HashMap<>();
    for(int num:arr){
        if(!freq.containsKey(num)){
            freq.put(num,1);
        }
        else{
            freq.put(num,freq.get(num)+1);
        }
        System.out.println(freq);

    }
    for(int key:freq.keySet()){
        System.out.println("Number "+key+" = "+freq.get(key)+" times seen in the array");

    }


}}
