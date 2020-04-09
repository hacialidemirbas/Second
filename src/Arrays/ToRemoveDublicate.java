package Arrays;
import java.util.Arrays;
public class ToRemoveDublicate {
    public static void main(String[] args) {
       int array[]={1,2,2,3,4,4,1};
        removeDublicate(array);
        System.out.println(Arrays.toString(removeDublicates(array)));
    }
    public static void removeDublicate(int[]arr){
        for (int i=0; i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }

        }
    }
    public static boolean  removedublicateNewArray(int value, int[] arr){
        boolean result=false;
        for (int number:arr){
            if(number==value){
                result=true;
            }
        }
        return result;
    }
    public static int [] removeDublicates(int []arr){
        int[] removedDub= new int[arr.length];
       // int index=0;
                for(int i=0;i<arr.length;i++){
            if(!removedublicateNewArray(arr[i],removedDub)){
                removedDub[i]=arr[i];
            }
        }
                return removedDub;
    }
}
