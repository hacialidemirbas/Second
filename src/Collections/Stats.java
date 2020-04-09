package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Stats {
    public static void main(String[] args) {
        Random myRandom= new Random();
        System.out.println(Math.abs(myRandom.nextInt(1000)));
        ArrayList<Integer>myArr=new ArrayList<Integer>();
        System.out.println(myArr.size());
        for(int i=0; i<20;i++){
            myArr.add(Math.abs(myRandom.nextInt(1000)));
        }
        System.out.println(myArr);
        Collections.sort(myArr);
        System.out.println(myArr);
        System.out.println(myArr.get(0));
        System.out.println(myArr.get(myArr.size()-1));
        System.out.println(myArr.get(myArr.size()/2));
    }
}
