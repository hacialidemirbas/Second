package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Java","is","Fun"));
        for(int i = arr.size()-1 ; i>=0 ; i--){
            System.out.print(reverseStr(arr.get(i))+" ");
        }

    }
    public static String reverseStr(String str){
        String reversed="";
        for(int i=str.length()-1 ; i>=0 ; i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}
