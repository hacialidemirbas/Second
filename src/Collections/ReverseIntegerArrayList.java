package Collections;

import java.util.ArrayList;

public class ReverseIntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myArr=new ArrayList<Integer>();
        myArr.add(5);
        myArr.add(15);
        myArr.add(1);
        myArr.add(6);
        System.out.println(myArr);
        ArrayList<Integer> reversedMyArr=new ArrayList<>();

        for(int i=myArr.size()-1;i>=0;i--){
            reversedMyArr.add(myArr.get(i));
                    }
        System.out.println(reversedMyArr);
        int temp;
        int index=myArr.size()-1;
        for(int i=0; i<myArr.size()/2;i++){
            temp=myArr.get(i);
            myArr.set(i,myArr.get(index));
            myArr.set(index,temp);
            index--;

        }
        System.out.println(myArr);
    }
}
