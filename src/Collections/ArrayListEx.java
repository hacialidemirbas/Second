package Collections;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        String sentence="Java is fun";
        ArrayList<Character> myArr= new ArrayList<>();
        for(int i=0;i<sentence.length();i++){
            myArr.add(i,sentence.charAt(i));
        }
        System.out.println(myArr);
    }
}
