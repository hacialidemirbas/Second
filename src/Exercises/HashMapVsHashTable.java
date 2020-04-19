package Exercises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapVsHashTable {
    public static void main(String[] args) {
        HashMap<String,String>hm= new HashMap<>();
        Hashtable<String,String> ht=new Hashtable<>();
        hm.put(null,"one");
        hm.put("two", null);
        hm.put("three", null);
        System.out.println(hm);
        //System.out.println(hm.get());
        Hashtable<Integer,Integer>ht1=new Hashtable<>();
        for(int i=0; i<11;i++){
            ht1.put(i, i*2);
        }
        System.out.println(ht1);
        Set<Integer> keys=ht1.keySet();
        Iterator<Integer> iter=keys.iterator();
        while(iter.hasNext()){
            int key=iter.next();
            System.out.print(key+" = "+ht.get(key)+" ");}
    }
}
