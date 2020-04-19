package Collections;

import java.util.HashMap;

public class VeryLargeNumber {
    public static void main(String[] args) {
        String input="123412345123456";
        String first3=input.substring(0,3);
        System.out.println(first3);
        int num=Integer.parseInt(first3);
        num++;
        System.out.println(num);
        findTriples(input);

    }
    public static void findTriples(String input){
        String first3=input.substring(0,3);
        int num=Integer.parseInt(first3);
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(num,1);
        String other3;
        int numberOther3;
        for(int i=0;i<input.length()-2;i++){
            other3=input.substring(i, i+3);
           // System.out.println("OTHER3"+other3);
            numberOther3=Integer.parseInt(other3);
            if(hm.containsKey(numberOther3)){
                hm.put(numberOther3,hm.get(numberOther3)+1);
            }
            else{
                hm.put(numberOther3,1);
            }

        }
        System.out.println(hm);
        for(int key:hm.keySet()){
            if(hm.get(key)>1){
                System.out.println("There are "+hm.get(key)+hm);
            }
        }

    }

}
