package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer>oddNums= new ArrayList<>();
        for(int i=0;i<100;i++){
            if(i%2!=0){
                oddNums.add(i);

            }

        }
        System.out.println("ODDNUMSo"+oddNums);
        Iterator<Integer>oddIter=oddNums.iterator();
        while(oddIter.hasNext()){
            System.out.print(oddIter.next()+", ");
        }

    }


}
