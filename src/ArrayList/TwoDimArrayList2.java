package ArrayList;

import java.util.ArrayList;

public class TwoDimArrayList2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myTwo = new ArrayList<>();
        int number=1;
        for(int i=0 ; i < 2 ; i++){
            myTwo.add(new ArrayList<>());
            for (int j=0 ; j<5 ; j++){
                myTwo.get(i).add(number);
                number++;
            }
        }
        //System.out.println(myTwo);
        for (int i=0 ; i<myTwo.size() ; i++){
            System.out.println(myTwo.get(i));
        }
        for(ArrayList<Integer> arr : myTwo){
            for(int numbers : arr){
                System.out.println(numbers);
            }
        }
        //while loop implementation
        int index=0;
        while(index<myTwo.size()){
            System.out.println(myTwo.get(index));
            index++;
        }
        //Nested while loop implementation
        int indexOuter=0;
        int indexInner;
        while(indexOuter<myTwo.size()){
            indexInner=0;
            while(indexInner<myTwo.get(indexOuter).size()){
                System.out.println(myTwo.get(indexOuter).get(indexInner));
                indexInner++;
            }
            indexOuter++;
        }
    }
}
