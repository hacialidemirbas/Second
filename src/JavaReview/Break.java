package JavaReview;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Break {
    public static void main(String[] args) {
        System.out.println('j'+'a'+'v'+'a');
        show();
        }
        public static void show(){
            LinkedList<String>list=new LinkedList<>();
            list.add("banana");
            list.add("apple");
            System.out.println(list);
            Iterator itr=list.iterator();
            Collections.sort(list);
            System.out.println(list);
        }
    }

