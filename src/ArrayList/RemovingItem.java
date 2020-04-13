package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

    public class RemovingItem {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            ArrayList<String> myList = new ArrayList<>(Arrays.asList("Java","SQL","HTML","CSS","Selenium"));
            System.out.println(myList);
            System.out.print("Enter item to remove : ");
            String item = scn.next();
            ArrayList<String> newList = new ArrayList<>();
            for(String element : myList){
                if(!element.equals(item)){
                    newList.add(element);
                }
            }
            System.out.println(newList);
        }
        public static ArrayList<String> removeItem(ArrayList<String> listOrg,String itemToRemove){
            ArrayList<String> updatedList = new ArrayList<>();
            for(String item : listOrg){
                if(!item.equals(itemToRemove)){
                    updatedList.add(item);
                }
            }
            return updatedList;
        }
    }

