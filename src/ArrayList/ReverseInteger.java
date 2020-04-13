package ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> numbersReversed = new ArrayList<>();
        for (int i=numbers.size()-1 ; i>=0 ; i--){
            numbersReversed.add(numbers.get(i));
        }
        System.out.println(numbersReversed);
        //Solution with 1 ArrayList
        int temp;
        int index=numbers.size()-1;
        for(int i=0 ; i<numbers.size()/2 ; i++){
            temp=numbers.get(i);
            numbers.set(i,numbers.get(index));
            numbers.set(index,temp);
            index--;
        }
        System.out.println(numbers);
    }

}
