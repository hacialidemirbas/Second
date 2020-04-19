package Collections;
import java.util.*;
public class HashSetEx2 {
    public static void main(String[] args) {
        String strg = "abcde";
        String strng = "abcdea";
        String str = "12345";
        System.out.println(isUnique(strg));
        System.out.println(unigueHashSet(strng,true));
        System.out.println(isUnique(str));
    }
    public static boolean unigueHashSet(String str, boolean x) {

        HashSet<Character> chars=new HashSet();
        for(int i=0; i < str.length(); i ++)   {
            if(!chars.add(str.charAt(i)))
                return false;
        }
        return true;
    }
    public static boolean isUnique(String strg){
        HashSet<Character> chars= new HashSet<>();
        for (int i=0;i<strg.length();i++){
            chars.add(strg.charAt(i));
        }
        if(strg.length()==chars.size()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void isUnique(int x){

        String strng = " ";
        strng+=x;
        HashSet<Character> chars= new HashSet<>();
        for (int i=0;i<strng.length();i++){
            chars.add(strng.charAt(i));
        }
        if(strng.length()==chars.size()){
            System.out.println("All chars are unique");
        }
        else{
            System.out.println("All chars are NOT unique");
        }
    }
}
