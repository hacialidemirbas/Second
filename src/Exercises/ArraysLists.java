package Exercises;

import java.util.ArrayList;

public class ArraysLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        /*a.add(4);
        a.add(15);
        a.add(1);
        a.add(89);
        a.add(24);
        System.out.println(a);*/
        /*Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);*/
        int [] num={4,15,1,89,24};
        int temp=a.get(0);
        ArrayList<Integer>b=new ArrayList<Integer>();
        for(int i=0;i<a.size();i++){
            if(a.get(i)<temp){
                temp=a.get(i);
                b.add(temp);
                            }
            System.out.println(b);


        }
    }
}
