package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String,Integer> marks=new TreeMap<>();
        marks.put("Vahit",100);
        marks.put("Shohrat",100);
        marks.put("Rumeysa",100);
        marks.put("Melih",100);
        marks.put("Ali",100);
        System.out.println(marks);
        System.out.println(marks.get("Vahit"));
        System.out.println(marks.values());
        Set<String>keys=marks.keySet();
        Iterator<String> iter = keys.iterator();
        String key;
        while (iter.hasNext()) {
            key = iter.next();
            System.out.println(key + " = " + marks.get(key));

        }
        System.out.println(marks.get("Vahit"));
        System.out.println(marks.values());
    }
}
