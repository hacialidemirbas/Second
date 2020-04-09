package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DublicateString {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>(Arrays.asList("Selenium","Selenium","Java","HTML","Java","Python"));
        ArrayList<String> newList=new ArrayList<>();
        for(String ali:arr){
            if(!newList.contains(ali)){
                newList.add(ali);
            }
        }
        System.out.println(newList);
    }
}
