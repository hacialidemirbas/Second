package Collections;

import java.util.HashMap;

public class NumberOfOccurencesChar {
    public static void main(String[] args) {
        String test="abcdeeacbda";
        findFrequenciesOfChar(test);
    }
    public static void findFrequenciesOfChar(String str){
        HashMap<Character, Integer>map=new HashMap<>();
        char key;
        int value;
        for(int i=0; i<str.length();i++){
            key=str.charAt(i);
            if(map.containsKey(str.charAt(i))){
                value=map.get(key);
                map.put(key,value+1);
            }
            else{
                map.put(key,1);

            }
        }
        System.out.println(map);

    }
}
