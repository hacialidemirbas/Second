package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class cutStringArrayList {
    public static void main(String[] args) {
        ArrayList<String>orrString=new ArrayList<>(Arrays.asList("Java","Is","Fun","Sunday","Is","Fun","day"));
        cutString(orrString);

    }
    public static void cutString(ArrayList<String> arr){
        ArrayList<String>myString= new ArrayList<>();
        int halfIndex=arr.size()/2;
        ArrayList half=new ArrayList<>();
        for(int i=0; i<halfIndex;i++){
            half.add(arr.get(i));

    }
        System.out.println(half);
}}
