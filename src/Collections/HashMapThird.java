package Collections;

import java.util.HashMap;

public class HashMapThird {
    public static void main(String[] args) {
        HashMap<String,Integer> third= new HashMap<>();
        third.put("Los Angeles",85);
        third.put("Chicago",30);
        third.put("Denver",55);
        third.put("Orlando",90);
        System.out.println(third);
        int average=0;
        for(String key:third.keySet()){
            System.out.println(key+"\t\t\t\t\t"+third.get(key));
            average+=third.get(key);
        }
        System.out.println("Average temp : "+average/third.size());

    }
}
