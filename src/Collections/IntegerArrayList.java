package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<Integer>();
        Random rndm= new Random();
        for(int i=0;i<11;i++){
           // myList.add((int) (Math.random()*1000));
            myList.add(rndm.nextInt(1000));
           // System.out.println(myList.get(i));
        }
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
        System.out.println("Min number is : "+myList.get(0));
        System.out.println("Max number is : "+myList.get(myList.size()-1));
        System.out.println("Median number is : "+myList.get(myList.size()/2));
    }
}
