package Collections;

import java.util.HashMap;

public class HashMapinsertion {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>(10);
        for(int i=0;i<10;i++){
            hm.put(i,i+i);
        }
        System.out.println(hm);
    }
}
