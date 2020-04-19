package Collections;

import java.util.Arrays;

public class AnagramSort {
    public static void main(String[] args) {
        String a="bacd";
        String b="bcda";
        char[]chara=a.toCharArray();
        char[]charb=b.toCharArray();
        Arrays.sort(chara);
        System.out.println(Arrays.toString(chara));
        Arrays.sort(charb);
        System.out.println(Arrays.toString(charb));
        if(Arrays.equals(chara,charb)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");}
        boolean isAnagram = true;
        for(int i = 0 ; i < chara.length ; i++ ){
            if(chara[i]!=charb[i]){
                isAnagram=false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Yess Anagram");
        }
        else{
            System.out.println("Noooo, Not anagram");
        }

    }
}
