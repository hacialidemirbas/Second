package Collections;

import java.util.ArrayList;

public class ArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String> myString=new ArrayList<>();
        String letters="abcdefghijklmnoprstuvwxyz";
        String word;
        for(int i=0;i<100;i++){
            word="";
            for(int j=0;j<5;j++){
                word+= letters.charAt((int)(Math.random()*letters.length()));
            }
            myString.add(word);
                    }
        System.out.println(myString);

    }

}
