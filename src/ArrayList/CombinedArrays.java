package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(7,8,9));
        System.out.println(combineArrays(arr1,arr2));
        arr1.addAll(arr2);//built-in method
        System.out.println(arr1);
    }
    //our method
    public static ArrayList<Integer> combineArrays(ArrayList<Integer> array1,ArrayList<Integer> array2){
        ArrayList<Integer> combined = new ArrayList<>();
        for(int element : array1){
            combined.add(element);
        }
        for(int element : array2){
            combined.add(element);
        }
        return combined;
    }
}

