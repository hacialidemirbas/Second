package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class removeString {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Java","is","fun"));
        ArrayList<String> arr1 = new ArrayList<>();
        for (int i=0; i<arr.size();i++){
            if(!arr.get(i).equalsIgnoreCase("is")){
                arr1.add(arr.get(i));
            }
        }
        System.out.println(arr1);
    }
    public static ArrayList<String> removeItem(ArrayList<String>orriginalList,String itemToRemove){
        ArrayList<String> updatedList= new ArrayList<>();
        for(String item:orriginalList){
            if(item.equalsIgnoreCase(itemToRemove)){
                updatedList.add(item);

            }
        }
        return updatedList;
    }

}
