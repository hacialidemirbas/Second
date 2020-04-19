package Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<String> myList=new LinkedList<>(Arrays.asList("Java","is","always","super","fun"));

        int longest=0;
        int index=0;
        for (int i = 0; i <myList.size() ; i++) {
            if(myList.get(i).length()>longest){
                longest=myList.get(i).length();
                index=i;
                System.out.println(myList.get(i));
            }
        }
        System.out.println("The longest word is : "+myList.get(index));

    }
   }
