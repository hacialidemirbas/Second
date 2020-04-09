package Arrays;

import java.util.Random;

public class randomArray {
    public static void main(String[] args) {
        createArrayWithRandom(100);
    }
    public static void createArrayWithRandom(int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*4001)+1000;
            System.out.println(arr[i]);
        }
    }
}
