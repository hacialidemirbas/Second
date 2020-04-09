package Collections;

import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList <Integer> myList=new ArrayList<Integer>();
        myList.add(4);
        myList.add(10);
        myList.add(50);
        myList.remove(2);
        //regular for loop
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        //for each loop
        for(int element:myList){
            System.out.println(element);
        }
        //while loop
        int index=0;
        while(myList.size()>index){
            System.out.println(myList.get(index));
            index++;
        }
    }
}
