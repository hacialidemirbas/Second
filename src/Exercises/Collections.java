package Exercises;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {

        ArrayList list=new ArrayList();
        System.out.println(list);
        list.add("Sam Iron");
        list.add("Fil Head");
        list.add("Kayra Nilu");
        list.add("Ali Veli");
        System.out.println(list);
        list.remove("Ali Veli");
        System.out.println(list);
        list.add("Hasan huseyin");
        list.remove(3);
        System.out.println(list);
        if(list.contains("Sam Iron")){
            System.out.println("Sam is a member");

        }
        System.out.println(list.size());
        Iterator iter= list.iterator();
        System.out.println(list);
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
       // list.clear();
        System.out.println(list);
        list.set(0,"Hasan Huseyin");
        list.set(1,"Ayse Fatma");
        list.set(2,"Ali Veli");
        System.out.println(list);
    }
}
