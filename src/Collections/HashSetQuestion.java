package Collections;

import java.util.HashSet;
import java.util.*;
public class HashSetQuestion {
    public static void main(String[] args) {
        //find distinct words
        String sentence="Java is Java";
        String [] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));
        HashSet<String> distWords = new HashSet<>();

for(String word:words){
    distWords.add(word);

}
        System.out.println(distWords);

    }
}
