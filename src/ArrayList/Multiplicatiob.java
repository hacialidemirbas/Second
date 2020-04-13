package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class Multiplicatiob {
        public static void main(String[] args) {
            ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            System.out.println(returnMult(arr1,arr2));
        }
        public static ArrayList<Integer> returnMult(ArrayList<Integer> first, ArrayList<Integer> second){
            ArrayList<Integer> result = new ArrayList<>();
            for(int i=0 ; i<first.size() ; i++){
                result.add(first.get(i)*second.get(i));
            }
            return result;
        }
    }

