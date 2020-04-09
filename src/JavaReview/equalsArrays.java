package JavaReview;

import java.util.Arrays;

public class equalsArrays {
    public static void main(String[] args) {
        int[] a1={3,4,5};
        int[] a2={3,4,5};
        if(Arrays.equals(a1,a2)){
            System.out.println("Equal elements");
        }
        else{
            System.out.println("Not equal");
        }
        if(a1.equals(a2)){//object not array
            System.out.println("Same object");
        }
        else{
            System.out.println("Not same object");
        }
    }
}
