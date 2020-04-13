package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> firstTwoDim=new ArrayList<>(3)    ;
        System.out.println(firstTwoDim);
        firstTwoDim.add(new ArrayList<>());
        System.out.println(firstTwoDim);
        firstTwoDim.add(new ArrayList<>());
        firstTwoDim.add(new ArrayList<>());
        System.out.println(firstTwoDim);
        for(int i=0; i<3;i++){
            for(int j=0; j<5; j++){
                firstTwoDim.get(i).add((int)Math.pow(j,2));
            }
        }
        ArrayList<Integer> toInsert=new ArrayList<>(Arrays.asList(1,2,3,4,54,65,77,92,111));
        System.out.println(firstTwoDim);
        firstTwoDim.add(toInsert);
        System.out.println(firstTwoDim);
    }
}
