package Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListShortestString {
    public static void main(String[] args) {
        LinkedList<String> myList=new LinkedList<>(Arrays.asList("Java","is","always","super","fun"));
        findShortestWord(myList);

        int shortest=myList.get(0).length();
        int index=0;
        for (int i = 1; i <myList.size() ; i++) {
            if(myList.get(i).length()<shortest){
                shortest=myList.get(i).length();
                index=i;
            }
        }
        System.out.println("The shortest word is : "+myList.get(index));

    }
    //Alternative solutions
    public static void findShortestWord(LinkedList<String> arr){
        int shortest=arr.get(0).length();
        String shortestWord="";
        for(int i=1 ; i<arr.size() ; i++){
            if(arr.get(i).length()<shortest){
                shortest=arr.get(i).length();
                shortestWord=arr.get(i);
            }
        }
        System.out.println("The shortest word is : "+shortestWord);
    }

}
