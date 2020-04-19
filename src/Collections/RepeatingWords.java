package Collections;

import java.util.HashMap;

public class RepeatingWords {
    public static void main(String[] args) {
String str="the best way to undesrtand java is the practice java using  java";
findRepeatings(str);
    }
    public static void findRepeatings(String sentence){
        sentence=sentence.toUpperCase();
        String[]words=sentence.split(" ");
        HashMap<String, Integer> wordCounts=new HashMap<>();
        for(String word:words){
            if(wordCounts.containsKey(word)){
                wordCounts.put(word,wordCounts.get(word)+1);
            }
            else{
                wordCounts.put(word,1);
            }
            System.out.println(word);

        }
        System.out.println("Repeating Words : ");
        for(String key : wordCounts.keySet()){
            if(wordCounts.get(key)>1){
                System.out.println(" --- "+key+" = \t"+wordCounts.get(key));
            }
        }


    }
}
