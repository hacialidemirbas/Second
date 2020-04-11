package Collections;

import java.util.ArrayList;

public class ArrayListReview {
    public static void main(String[] args) {
        ArrayList<String> myArr= new ArrayList<>();
        System.out.println(myArr);
        String[]arr=new String[0];
        String arr2[]= {"q","w","e"};
       // System.out.println(arr[0]);
        System.out.println(arr2[0]);
        myArr.add("Java");
        myArr.add("is");
        myArr.add("love");
        System.out.println(myArr);
        myArr.remove("Java");
        System.out.println(myArr);
        myArr.remove(0);
        System.out.println(myArr);
        myArr.set(0,"Hello World");
        System.out.println(myArr);


    }
}
