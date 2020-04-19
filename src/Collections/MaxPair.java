package Collections;

import java.util.HashMap;

public class MaxPair {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,2,10,6,4};
        findAdjacentMax(arr);
    }
    public static void findAdjacentMax(int []arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            hm.put(i,arr[i]*arr[i+1]);
        }
        //System.out.println(hm);
        int max=0;
        int index=0;
        for(int key:hm.keySet()){
            if(hm.get(key)>max){
                max=hm.get(key);
                index=key;
            }
        }
        System.out.println("index 1 : \t"+index+"\t\t index 2 : \t"+(index+1)+
                "\n Max multiplication is: \t"+arr[index]+"*"+arr[index+1]+"="+max);
    }

}
