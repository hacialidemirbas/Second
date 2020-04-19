package Collections;

import java.util.HashMap;

public class HashMapSecond {
    public static void main(String[] args) {
        HashMap<String,String> second= new HashMap<>();
        second.put("Java","medium");
        second.put("SQL","entry");
        second.put("Selenium","master");
        second.put("Cucumber","expert");
        System.out.println(second);
        for(String key:second.keySet()){
            System.out.println(key+"\t\t\t"+second.get(key));
        }
    }
}
