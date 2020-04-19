package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapLoop {
    public static void main(String [] args)
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //Adding elements to HashMap
        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "GH");
        hmap.put(3, "IJ");
        System.out.println(hmap);

        //FOR LOOP
       // System.out.println("For Loop:");
        for (Map.Entry me : hmap.entrySet()) {
            //System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        //WHILE LOOP & ITERATOR
       // System.out.println("While Loop:");
        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();
           // System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }
//can not use normal for loop
        for(int i=0;i<hmap.size();i++){
            System.out.println(hmap.get(i));
        }
    }
}
